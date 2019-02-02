package listservices.listservices.controller;

import listservices.listservices.entity.Item;
import listservices.listservices.repository.StarbucksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class ItemController {

    @Autowired
    private StarbucksRepository starbucksRepository;

    @PostMapping("/items")
    public Item dayAndMoneySaved(@RequestBody Item item) {
        return starbucksRepository.save(item);
    }

    @GetMapping("/items")
    public Iterable<Item> getItems() {
        return starbucksRepository.findAll();
    }

    @PatchMapping("/items")
    public Item updateItem(@RequestBody Item item) {
        return starbucksRepository.save(item);
    }
}

