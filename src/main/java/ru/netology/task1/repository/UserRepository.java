package ru.netology.task1.repository;

import org.springframework.stereotype.Repository;
import ru.netology.task1.model.Authorities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        switch (user) {
            case "admin" -> {
                if (password.equals("admin")) {
                    return Arrays.asList(Authorities.WRITE, Authorities.READ, Authorities.DELETE);
                } else {
                    return new ArrayList<>();
                }
            }
            case "user" -> {
                if (password.equals("user")) {
                    return Arrays.asList(Authorities.WRITE, Authorities.READ);
                } else {
                    return new ArrayList<>();
                }
            }
        }
        return new ArrayList<>();
    }
}
