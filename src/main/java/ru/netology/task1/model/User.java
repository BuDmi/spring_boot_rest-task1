package ru.netology.task1.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class User {
    @NotBlank
    @Size(min = 1)
    private String user;
    @NotBlank
    @Size(min = 3, max = 10)
    private String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(this.user, user.user) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }
}
