package listservices.listservices.controller;

import listservices.listservices.entity.Item;
import listservices.listservices.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
public class ItemController {

    private ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @PostMapping("/item")
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @GetMapping("/items")
    public Iterable<Item> getItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/item/{id}")
    public Optional<Item> getItemById(@PathVariable Integer id) {
        return itemRepository.findById(id);
    }

    @PatchMapping("/item")
    public Item updateItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @DeleteMapping("/item")
    public String deleteItem(@RequestBody Item item) {
        if(getItemById(item.getId()).isPresent()) {
            itemRepository.delete(item);
            return "Item deleted";
        }else{
            return "No Item found with Id: " + item.getId();
        }
    }
}
