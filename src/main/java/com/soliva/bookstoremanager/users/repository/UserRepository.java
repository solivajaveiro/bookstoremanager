package com.soliva.bookstoremanager.users.repository;

import com.soliva.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
