package code.collections.mapKeyCollision;

import java.util.Objects;

public class PersonCat {

    private String name;

    public PersonCat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonCat personCat)) return false;
        return Objects.equals(name, personCat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "PersonCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
