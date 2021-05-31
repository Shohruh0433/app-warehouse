package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.appwarehouse.entity.warehouseEntity.Input_Product;

public interface InputProductRepository extends JpaRepository<Input_Product,Long> {
}
