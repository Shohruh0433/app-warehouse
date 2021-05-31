package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.appwarehouse.entity.warehouseEntity.Input;

public interface InputRepository extends JpaRepository<Input,Long> {
}
