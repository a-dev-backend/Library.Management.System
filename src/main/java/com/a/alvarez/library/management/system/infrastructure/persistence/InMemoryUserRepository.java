package com.a.alvarez.library.management.system.infrastructure.persistence;


import com.a.alvarez.library.management.system.domain.enums.Role;
import com.a.alvarez.library.management.system.domain.model.User;
import com.a.alvarez.library.management.system.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {

    private final List<User> users = new ArrayList<>();

    @Override
    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return users.stream()
                .filter(user -> user.getCredential().getUsername().equals(username))
                .findFirst();
    }

    @Override
    public void save(User user) {
        users.add(user);

    }


    @Override
    public List<User> findAllByRole(Role role) {
        return users.stream()
                .filter(user -> user.getRole().equals(role))
                .toList();
    }



    @Override
    public void delete(User user) {

        users.removeIf(u -> u.getId().equals(user.getId()));
    }


}
