package Microservices2.iitu.Product.Service.repository;

import Microservices2.iitu.Product.Service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
