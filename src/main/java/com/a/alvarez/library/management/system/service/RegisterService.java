package com.a.alvarez.library.management.system.service;

import com.a.alvarez.library.management.system.domain.enums.StatusMember;
import com.a.alvarez.library.management.system.domain.model.Contact;
import com.a.alvarez.library.management.system.domain.model.Credential;
import com.a.alvarez.library.management.system.domain.model.Identity;
import com.a.alvarez.library.management.system.domain.model.Member;
import com.a.alvarez.library.management.system.service.validate.PasswordValidator;
import com.a.alvarez.library.management.system.service.validate.UserNameValidator;
import com.a.alvarez.library.management.system.util.validate.*;

import java.time.LocalDate;


public class RegisterService {

    private UserNameValidator userNameValidate = new UserNameValidator();
    private PasswordValidator passwordValidate = new PasswordValidator() ;



    public RegisterService() {
    }
    public void registerMember(String firstName, String lastName, LocalDate birthDate, String dni, String email, String phoneNumber,String userName, String password) {


        NameValidate.verifyName(firstName, lastName);
        DniValidate.verifyDni(dni);
        BirthDateValidate.verifyBirthDate(birthDate);
        EmailValidate.verifyEmail(email);
        PhoneNumberValidate.verifyPhone(phoneNumber);
        userNameValidate.usernameVerifying(userName);
        passwordValidate.passwordVerifying(password);

        Identity identity = new Identity(firstName, lastName, dni, birthDate);
        Contact contact = new Contact(email, phoneNumber);
        Credential credential = new Credential(userName,password);

        Member member = new Member(StatusMember.ACTIVE,credential,contact,identity);
    }
}
