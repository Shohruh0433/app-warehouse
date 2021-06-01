package uz.developers.appwarehouse.controller.warehouse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.developers.appwarehouse.dto.ProductDto;

import uz.developers.appwarehouse.entity.warehouseEntity.Product;
import uz.developers.appwarehouse.results.Result;
import uz.developers.appwarehouse.service.worehouseService.ProductService;



@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Result add(@RequestBody ProductDto productDto){
        return productService.add(productDto);
    }

    @PutMapping("/{id}")
    public  Result edit(@PathVariable Long id,@RequestBody ProductDto productDto)
    {
        return productService.edit(id, productDto);
    }

    @PutMapping("/active/{id}")
    public Result active(@PathVariable Long id){
        return productService.active(id);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        return productService.noActive(id);
    }
    @GetMapping("/byCategoryId/{category_id}")
    public Page<Product> getAllByCategoryId(@RequestParam int page,@PathVariable Long category_id){
        return productService.getByCategoryId(category_id,page);
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return productService.getById( id) ;
    }

}
