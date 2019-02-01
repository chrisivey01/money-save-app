package listservices.listservices.controller;

import listservices.listservices.entity.Item;
import listservices.listservices.repository.StarbucksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class ItemController {

    @Autowired
    private StarbucksRepository starbucksRepository;

    @PostMapping("/items")
    @Transactional
    public Item dayAndMoneySaved(@RequestBody Item item){

        item.setItem(item.getItem());

        if(item.getItem().equals("Starbucks") || item.getItem().equals("starbucks") ) {

            it
            item.setDays_without_item(item.getDays_without_item());
            item.setMoney_saved_without_item(item.getMoney_saved_without_item());

            item = starbucksRepository.(item);
        }
        return item;
    }
}
