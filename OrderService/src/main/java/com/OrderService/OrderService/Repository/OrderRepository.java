package com.OrderService.OrderService.Repository;

import com.OrderService.OrderService.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
