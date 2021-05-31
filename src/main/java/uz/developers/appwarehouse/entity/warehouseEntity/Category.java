package uz.developers.appwarehouse.entity.warehouseEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.developers.appwarehouse.entity.extendesClasses.AbsClass;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)

@Data
@Entity
public class Category extends AbsClass {
    @ManyToOne
    private Category category;

}
