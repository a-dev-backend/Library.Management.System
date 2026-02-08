package com.a.alvarez.library.management.system.domain.model;

import com.a.alvarez.library.management.system.domain.enums.StatusAdministrator;

public class Administrator {

    private Long id;
    private Identity identity;
    private Contact contact;
    private Credential credential;
    private StatusAdministrator statusAdministrator;

    public Administrator(StatusAdministrator statusAdministrator, Credential credential, Contact contact, Identity identity) {
        this.statusAdministrator = statusAdministrator;
        this.credential = credential;
        this.contact = contact;
        this.identity = identity;
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

    public StatusAdministrator getStatusAdministrator() {
        return statusAdministrator;
    }

    public void setStatusAdministrator(StatusAdministrator statusAdministrator) {
        this.statusAdministrator = statusAdministrator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", identity=" + identity +
                ", contact=" + contact +
                ", credential=" + credential +
                ", statusAdministrator=" + statusAdministrator +
                '}';
    }
}
