package com.educantoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educantoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
