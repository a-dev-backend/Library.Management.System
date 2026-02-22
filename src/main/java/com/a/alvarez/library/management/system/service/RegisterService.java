package com.a.alvarez.library.management.system.service;

import com.a.alvarez.library.management.system.domain.enums.Role;
import com.a.alvarez.library.management.system.domain.model.*;
import com.a.alvarez.library.management.system.repository.UserRepository;
import com.a.alvarez.library.management.system.util.IdGenerator;
import com.a.alvarez.library.management.system.util.MemberNumberGenerator;
import com.a.alvarez.library.management.system.validate.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RegisterService {

    private UserNameValidator userNameValidate;
    private PasswordValidator passwordValidate;
    private UserRepository userRepository;

    public RegisterService(UserNameValidator userNameValidate, PasswordValidator passwordValidate, UserRepository userRepository) {
        this.userNameValidate = userNameValidate;
        this.passwordValidate = passwordValidate;
        this.userRepository = userRepository;
    }

    public void registerMember(String firstName, String lastName, LocalDate birthDate, String dni, String email, String phoneNumber, String userName, String password) {


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

        User user = new User(IdGenerator.nextId(),identity,contact,credential, Role.MEMBER, MemberNumberGenerator.nextNumber());
        userRepository.save(user);
    }

}
