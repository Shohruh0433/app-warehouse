package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.appwarehouse.entity.warehouseEntity.Output_Product;

public interface OutputProductRepository extends JpaRepository<Output_Product,Long> {


}
