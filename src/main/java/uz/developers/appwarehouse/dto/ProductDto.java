package uz.developers.appwarehouse.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductDto {

    private String name;
    private Long category_id;
    private List<Integer> attachment_id;
    private Long measurement_id;

}
