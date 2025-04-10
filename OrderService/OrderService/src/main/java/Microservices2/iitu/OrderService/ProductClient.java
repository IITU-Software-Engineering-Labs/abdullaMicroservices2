package Microservices2.iitu.OrderService;

import Microservices2.iitu.OrderService.DTO.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Product-Service")
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable String id);
}