package de.service.services;

import de.service.forms.UserForm;
import de.service.models.User;

import java.util.List;

public interface UsersService {
    void signUp(UserForm userForm);

    List<User> findAll();

    User findOne(Long userId);
}
