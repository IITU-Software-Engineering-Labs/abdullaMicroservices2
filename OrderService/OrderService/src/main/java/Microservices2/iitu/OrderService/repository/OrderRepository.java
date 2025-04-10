package Microservices2.iitu.OrderService.repository;


import Microservices2.iitu.OrderService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
