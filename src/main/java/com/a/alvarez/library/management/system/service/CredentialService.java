package com.a.alvarez.library.management.system.service;

import com.a.alvarez.library.management.system.domain.model.Credential;
import com.a.alvarez.library.management.system.service.validate.PasswordValidator;
import com.a.alvarez.library.management.system.service.validate.UserNameValidator;

public class CredentialService {

    private UserNameValidator userNameValidate = new UserNameValidator();
    private PasswordValidator passwordValidate = new PasswordValidator();

    public CredentialService() {

    }

    public void credentialMember(String username, String password){

        username.strip();
        password.strip();

        userNameValidate.usernameVerifying(username);
        passwordValidate.passwordVerifying(password);

        Credential credential = new Credential(username,password);

    }
}
