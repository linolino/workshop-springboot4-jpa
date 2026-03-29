package com.educantoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educantoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
