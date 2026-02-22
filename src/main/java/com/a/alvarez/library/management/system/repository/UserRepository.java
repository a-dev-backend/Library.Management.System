package com.a.alvarez.library.management.system.repository;
import com.a.alvarez.library.management.system.domain.enums.Role;

import com.a.alvarez.library.management.system.domain.model.User;



import java.util.List;
import java.util.Optional;


public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    public List<User> findAllByRole(Role role);

    void save(User user);


    void delete(User user);

}
