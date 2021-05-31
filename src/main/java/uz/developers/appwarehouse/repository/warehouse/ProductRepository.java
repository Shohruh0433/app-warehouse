package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.appwarehouse.entity.warehouseEntity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
