package lesson_14.code.demoShop39.src.main.java.org.demoshop39fs.service;

import lombok.Data;
import org.demoshop39fs.dto.UserResponse;
import org.demoshop39fs.entity.ConfirmationCode;
import org.demoshop39fs.entity.User;
import org.demoshop39fs.exceptions.RestException;
import org.demoshop39fs.repository.ConfirmationCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Service
public class ConfirmationCodeService {

    private final ConfirmationCodeRepository repository;
    private final UserService userService;

    public String createCode(User user){
        String codeValue = UUID.randomUUID().toString();
        ConfirmationCode code = ConfirmationCode.builder()
                .code(codeValue)
                .user(user)
                .expiredDateTime(LocalDateTime.now().plusDays(1))
                .build();

        repository.save(code);
        return codeValue;
    }

    public UserResponse confirm(String confirmationCode){
        ConfirmationCode code = repository
                .findByCodeAndExpiredDateTimeAfter(confirmationCode, LocalDateTime.now())
                .orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Код не найден или истек срок его действия"));

        User confirmedUser = code.getUser();
        confirmedUser.setState(User.State.CONFIRMED);

        userService.save(confirmedUser);

        return UserResponse.builder()
                .id(confirmedUser.getId())
                .firstName(confirmedUser.getFirstName())
                .lastName(confirmedUser.getLastName())
                .email(confirmedUser.getEmail())
                .role(confirmedUser.getRole().toString())
                .state(confirmedUser.getState().toString())
                .build();
    }

}
