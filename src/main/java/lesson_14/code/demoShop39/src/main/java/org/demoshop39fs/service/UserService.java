package lesson_14.code.demoShop39.src.main.java.org.demoshop39fs.service;

import lombok.Data;
import org.demoshop39fs.dto.CreateRequestUser;
import org.demoshop39fs.dto.UserResponse;
import org.demoshop39fs.entity.User;
import org.demoshop39fs.exceptions.RestException;
import org.demoshop39fs.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Data
@Service
public class UserService {

    private final UserRepository repository;
    private final ConfirmationCodeService confirmationCodeService;


    public UserResponse registerUser(CreateRequestUser request){
        if (repository.existsByEmail(request.getEmail())){
            throw new RestException(HttpStatus.CONFLICT, "Пользователь с email: " + request.getEmail() + " уже зарегистрирован");
        }

        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword()) // пока в открытом виде, но потом будем его хешировать
                .role(User.Role.USER)
                .state(User.State.NOT_CONFIRMED)
                .build();

        repository.save(user);

        String confirmationCode = confirmationCodeService.createCode(user);

        // потом заменим на отправку по почте
        System.out.println("Отправили по почте код подтверждения: " + confirmationCode);

        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .role(user.getRole().toString())
                .state(user.getState().toString())
                .build();
    }
    // ????? обновить пользователя с учетом изменения только поля STATUS

    public void save(User user){
        repository.save(user);
    }

}
