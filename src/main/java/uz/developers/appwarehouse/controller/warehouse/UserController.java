package uz.developers.appwarehouse.controller.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.developers.appwarehouse.dto.UserDto;
import uz.developers.appwarehouse.dto.WarehouseDto;
import uz.developers.appwarehouse.entity.warehouseEntity.User;
import uz.developers.appwarehouse.entity.warehouseEntity.Warehouse;
import uz.developers.appwarehouse.results.Result;
import uz.developers.appwarehouse.service.worehouseService.UserService;
import uz.developers.appwarehouse.service.worehouseService.WarehouseService;


@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping
    public Result add(@RequestBody UserDto userDto){

        return userService.add(userDto);
    }

    @DeleteMapping("/{id}")
    public Result noActive(@PathVariable Long id){
        return userService.delete(id);
    }

    @PostMapping("/active/{id}")
    public Result active(@PathVariable Long id){
        return userService.active(id);
    }

    @PutMapping("/{id}")
    public Result edit(@PathVariable Long id,@RequestBody UserDto userDto){
        return userService.edit(userDto,id);
    }
    @GetMapping("/{id}")
    public User getbyId(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping("/all")
    public Page<User> getAll(@RequestParam int page){
        return userService.getAll(page);
    }

    @GetMapping("/byWarehouseId/{id}")
    public Page<User> getByWarehouse_id(@PathVariable Long id,@RequestParam int page){
        return userService.getByWarehouseId(page, id);
    }



}
