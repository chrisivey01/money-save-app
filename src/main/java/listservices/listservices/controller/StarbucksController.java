package listservices.listservices.controller;

import listservices.listservices.entity.Starbucks;
import listservices.listservices.repository.StarbucksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class StarbucksController {

    @Autowired
    StarbucksRepository starbucksRepository;

    @PostMapping("/starbucks")
    public Starbucks dayAndMoneySaved(@RequestBody Starbucks starbucks){

        starbucks.setDaysWithoutStarbucks(starbucks.getDaysWithoutStarbucks());
        starbucks.setMoneySavedWithoutStarbucks(starbucks.getMoneySavedWithoutStarbucks());

        starbucks = starbucksRepository.save(starbucks);

        return starbucks;

    }
}
