package uz.developers.appwarehouse.controller.warehouse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.developers.appwarehouse.dto.InputDto;
import uz.developers.appwarehouse.entity.warehouseEntity.Input;
import uz.developers.appwarehouse.results.Result;
import uz.developers.appwarehouse.service.worehouseService.InputService;

import java.sql.Timestamp;

@RestController
@RequestMapping("/input")
public class InputController {

    @Autowired
    InputService inputService;

    @PostMapping
    public Result add(@RequestBody InputDto inputDto){
        return inputService.add(inputDto);
    }

    @PutMapping("/{id}")
    public Result edit(@RequestBody InputDto inputDto,@PathVariable Long id){
        return inputService.edit(id,inputDto);
    }

    @GetMapping("/byWarehouseId/{id}")
    public Page<Input> getByWareHouseid(@PathVariable Long id,@RequestParam int page){
        return inputService.getByWarehouseId(id,page);
    }

    @GetMapping("/bySupliesPhoneNumber/{phoneNumber}")
    public Page<Input> getBySupplierPhone(@PathVariable String phoneNumber,@RequestParam int page){
        return inputService.getBySuplierPhoneNumber(phoneNumber,page);
    }

    @GetMapping("/byCurrencyId/{id}")
    public Page<Input> getByCurrencyId(@PathVariable Long id,@RequestParam int page){
        return inputService.getByCurrencyId(id,page);
    }
    @GetMapping("/byFactureNomer/{factureNomer}")
    public Input getByFactureNomer(@PathVariable String factureNomer){
        return inputService.getByFacturaNomer(factureNomer);
    }

    @GetMapping("/byDate/{id}")
    public Page<Input> getBydate(@PathVariable Timestamp date, @RequestParam int page){
        return inputService.getByDate(date,page);
    }



}
