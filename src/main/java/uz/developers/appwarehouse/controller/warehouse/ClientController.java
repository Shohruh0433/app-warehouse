package uz.developers.appwarehouse.controller.warehouse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.developers.appwarehouse.dto.ClientDto;
import uz.developers.appwarehouse.dto.SupplierDto;
import uz.developers.appwarehouse.entity.warehouseEntity.Client;
import uz.developers.appwarehouse.entity.warehouseEntity.Supplier;
import uz.developers.appwarehouse.results.Result;
import uz.developers.appwarehouse.service.worehouseService.ClientService;
import uz.developers.appwarehouse.service.worehouseService.SupplierService;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping
    public Result add(@RequestBody ClientDto clientDto){
        return clientService.add(clientDto);

    }

    @DeleteMapping("/{id}")
    public Result noActive(@PathVariable Long id){
        return clientService.delete(id);
    }

    @PostMapping("/active/{id}")
    public Result active(@PathVariable Long id){
        return clientService.active(id);
    }

    @PutMapping("/{id}")
    public Result edit(@PathVariable Long id,@RequestBody ClientDto clientDto){
        return clientService.edit(id,clientDto);
    }
    @GetMapping("/{id}")
    public Client getbyId(@PathVariable Long id){
        return clientService.getById(id);
    }

    @GetMapping("/all")
    public Page<Client> getAll(@RequestParam int page){
        return clientService.getAll(page);
    }





}
