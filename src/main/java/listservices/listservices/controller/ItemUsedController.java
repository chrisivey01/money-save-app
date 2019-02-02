package listservices.listservices.controller;

import listservices.listservices.entity.ItemUsed;
import listservices.listservices.repository.ItemUsedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
public class ItemUsedController {

    private ItemUsedRepository itemUsedRepository;

    @Autowired
    public ItemUsedController(ItemUsedRepository itemUsedRepository) {
        this.itemUsedRepository = itemUsedRepository;
    }

    @PostMapping("/itemUsed")
    public ItemUsed createItemUsed(@RequestBody ItemUsed itemUsed) {
        return itemUsedRepository.save(itemUsed);
    }

    @GetMapping("/itemsUsed")
    public Iterable<ItemUsed> getItemsUsed() {
        return itemUsedRepository.findAll();
    }

    @GetMapping("/itemUsed/{id}")
    public Optional<ItemUsed> getItemUsedById(@PathVariable Integer id) {
        return itemUsedRepository.findById(id);
    }

    @PatchMapping("/itemUsed")
    public ItemUsed updateItemUsed(@RequestBody ItemUsed itemUsed) {
        return itemUsedRepository.save(itemUsed);
    }

    @DeleteMapping("/itemUsed")
    public String deleteItemUsed(@RequestBody ItemUsed itemUsed) {
        if (getItemUsedById(itemUsed.getId()).isPresent()) {
            itemUsedRepository.delete(itemUsed);
            return "ItemUsed deleted";
        } else {
            return "No ItemUsed found with Id: " + itemUsed.getId();
        }
    }
}
