package com.done.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.done.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
