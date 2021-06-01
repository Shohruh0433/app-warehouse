package uz.developers.appwarehouse.service.worehouseService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.developers.appwarehouse.repository.warehouse.InputRepository;
import uz.developers.appwarehouse.repository.warehouse.ProductRepository;

@Service
public class InputProductService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    InputRepository inputRepository;


}
