package de.service.services;

import de.service.forms.LoginForm;
import de.service.transfer.TokenDto;

public interface LoginService {
    TokenDto login(LoginForm loginForm);
}
