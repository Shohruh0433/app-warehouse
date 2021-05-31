package uz.developers.appwarehouse.controller.warehouse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.developers.appwarehouse.dto.WarehouseDto;
import uz.developers.appwarehouse.entity.warehouseEntity.Warehouse;
import uz.developers.appwarehouse.results.Result;
import uz.developers.appwarehouse.service.worehouseService.WarehouseService;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @PostMapping
    public Result add(@RequestBody WarehouseDto warehouseDto){
        return warehouseService.add(warehouseDto);
    }

    @DeleteMapping("/{id}")
    public Result noActive(@PathVariable Long id){
        return warehouseService.delete(id);
    }

    @PostMapping("/active/{id}")
    public Result active(@PathVariable Long id){
        return warehouseService.active(id);
    }

    @PutMapping("/{id}")
    public Result edit(@PathVariable Long id,@RequestBody WarehouseDto warehouseDto){
        return warehouseService.edit(id,warehouseDto);
    }
    @GetMapping("/{id}")
    public Warehouse getbyId(@PathVariable Long id){
        return warehouseService.getById(id);
    }

    @GetMapping("/all")
    public Page<Warehouse> getAll(@RequestParam int page){
        return warehouseService.getAllWareHouse(page);
    }





}
