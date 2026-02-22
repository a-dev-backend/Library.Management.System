package com.a.alvarez.library.management.system.domain.model;

import com.a.alvarez.library.management.system.domain.enums.Role;
import com.a.alvarez.library.management.system.util.IdGenerator;

public class User {

    private Long id;
    private Identity identity;
    private Contact contact;
    private Credential credential;
    private Role role;
    private String memberNumber;

    public User(Long id, Identity identity, Contact contact, Credential credential, Role role, String memberNumber) {
        this.id = id;
        this.identity = identity;
        this.contact = contact;
        this.credential = credential;
        this.role = role;
        this.memberNumber = memberNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", identity=" + identity +
                ", contact=" + contact +
                ", credential=" + credential +
                ", role=" + role +
                ", memberNumber='" + memberNumber + '\'' +
                '}';
    }
}
