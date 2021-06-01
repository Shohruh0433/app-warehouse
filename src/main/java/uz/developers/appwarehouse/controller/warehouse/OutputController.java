package uz.developers.appwarehouse.controller.warehouse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.developers.appwarehouse.dto.InputDto;
import uz.developers.appwarehouse.dto.OutputDto;
import uz.developers.appwarehouse.entity.warehouseEntity.Input;
import uz.developers.appwarehouse.entity.warehouseEntity.Output;
import uz.developers.appwarehouse.results.Result;
import uz.developers.appwarehouse.service.worehouseService.InputService;
import uz.developers.appwarehouse.service.worehouseService.OutputService;

import java.sql.Timestamp;

@RestController
@RequestMapping("/output")
public class OutputController {

    @Autowired
    OutputService outputService;

    @PostMapping
    public Result add(@RequestBody OutputDto outputDto){
        return outputService.add(outputDto);
    }

    @PutMapping("/{id}")
    public Result edit(@RequestBody OutputDto outputDto,@PathVariable Long id){
        return outputService.edit(id,outputDto);
    }

    @GetMapping("/byWarehouseId/{id}")
    public Page<Output> getByWareHouseid(@PathVariable Long id, @RequestParam int page){
        return outputService.getByWarehouseId(id,page);
    }

    @GetMapping("/byClientPhoneNumber/{phoneNumber}")
    public Page<Output> getBySupplierPhone(@PathVariable String phoneNumber,@RequestParam int page){
        return outputService.getByClientPhoneNumber(phoneNumber,page);
    }

    @GetMapping("/byCurrencyId/{id}")
    public Page<Output> getByCurrencyId(@PathVariable Long id,@RequestParam int page){
        return outputService.getByCurrencyId(id,page);
    }
    @GetMapping("/byFactureNomer/{factureNomer}")
    public Output getByFactureNomer(@PathVariable String factureNomer){
        return outputService.getByFacturaNomer(factureNomer);
    }

    @GetMapping("/byDate/{id}")
    public Page<Output> getBydate(@PathVariable Timestamp date, @RequestParam int page){
        return outputService.getByDate(date,page);
    }



}
