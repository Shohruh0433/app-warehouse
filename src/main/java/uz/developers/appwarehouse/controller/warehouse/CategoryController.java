package uz.developers.appwarehouse.controller.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.developers.appwarehouse.dto.CategoryDto;
import uz.developers.appwarehouse.entity.warehouseEntity.Category;
import uz.developers.appwarehouse.results.Result;
import uz.developers.appwarehouse.service.worehouseService.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping
    public Result add(@RequestBody CategoryDto categoryDto){
        return categoryService.add(categoryDto);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        return categoryService.delete(id);
    }

    @GetMapping("/byCategoryId/{id}")
    public List<Category> getByCatId(@PathVariable Long id){
        return categoryService.getByPresentId(id);
    }

    @PostMapping("/active/{id}")
        public  Result active(@PathVariable Long id){
        return categoryService.active(id);
    }

    @PutMapping("/edit/{id}")
    public Result edit(@RequestBody CategoryDto categoryDto,@PathVariable Long id){
        return categoryService.edit(categoryDto,id);
    }
}
