package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.appwarehouse.entity.warehouseEntity.Output;

public interface OutputRepository extends JpaRepository<Output,Long> {
}
