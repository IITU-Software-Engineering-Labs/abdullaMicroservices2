package Microservices2.iitu.Inventory.Service.Repository;

import Microservices2.iitu.Inventory.Service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
