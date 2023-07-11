package com.lexi.vlogapp.dao.repository;

import com.lexi.vlogapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Set<User> findUsersByName(String name);

    Set<User> findUserByEmail(String email);
}