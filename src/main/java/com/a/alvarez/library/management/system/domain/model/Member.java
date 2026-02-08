package com.a.alvarez.library.management.system.domain.model;

import com.a.alvarez.library.management.system.domain.enums.StatusMember;

public class Member {


    private Long id;
    private Identity identity;
    private Contact contact;
    private Credential credential;
    private StatusMember statusMember;
    private int nroMember;

    public Member(Long id, int nroMember, StatusMember statusMember, Credential credential, Contact contact, Identity identity) {
        this.id = id;
        this.nroMember = nroMember;
        this.statusMember = statusMember;
        this.credential = credential;
        this.contact = contact;
        this.identity = identity;
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

    public StatusMember getStatusMember() {
        return statusMember;
    }

    public void setStatusMember(StatusMember statusMember) {
        this.statusMember = statusMember;
    }

    public int getNroMember() {
        return nroMember;
    }

    public void setNroMember(int nroMember) {
        this.nroMember = nroMember;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", identity=" + identity +
                ", contact=" + contact +
                ", credential=" + credential +
                ", statusMember=" + statusMember +
                ", nroMember=" + nroMember +
                '}';
    }
}
