package com.example.repository;


import com.example.component.Authorities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserRepository {
    private final List<User> users =
            Arrays.asList(
                    new User("admin", "1234",
                            Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE)),
                    new User("user", "4321",
                            Arrays.asList(Authorities.READ, Authorities.WRITE)),
                    new User("guest", "123",
                            Arrays.asList(Authorities.READ)),
                    new User("someone", "321", Collections.emptyList())
            );

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (User u : users) {
            if (u.getName().equals(user) && u.getPassword().equals(password)) {
                return u.getAuthorities();
            }
        }
        return Collections.emptyList();
    }

}