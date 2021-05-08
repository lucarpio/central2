package edu.programacion.central.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.programacion.central.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}