package com.a.alvarez.library.management.system.service;

import com.a.alvarez.library.management.system.domain.model.User;
import com.a.alvarez.library.management.system.repository.UserRepository;
import com.a.alvarez.library.management.system.validate.PasswordValidator;
import com.a.alvarez.library.management.system.validate.UserNameValidator;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private UserRepository memberRepository;
    private UserNameValidator userNameValidator;
    private PasswordValidator passwordValidator;

    public AuthService(UserRepository memberRepository,
                       UserNameValidator userNameValidator,
                       PasswordValidator passwordValidator) {

        this.memberRepository = memberRepository;
        this.userNameValidator = userNameValidator;
        this.passwordValidator = passwordValidator;
    }

    public User authenticate(String username, String password) {

        // validar formato
        userNameValidator.usernameVerifying(username);
        passwordValidator.passwordVerifying(password);

        // buscar usuario
        User user = memberRepository.findByUsername(username)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));

        // validar password
        if (!user.getCredential().getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return user;
    }
}
