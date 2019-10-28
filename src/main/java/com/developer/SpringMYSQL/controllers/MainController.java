package com.developer.SpringMYSQL.controllers;

import com.developer.SpringMYSQL.Models.AppAnimals;
import com.developer.SpringMYSQL.Models.AppAnimalsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    AppAnimalsRepo appRepo;


    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("list", appRepo.findAll());

        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("id") String id, @RequestParam("animal_name") String animal_name, @RequestParam("animal_type") String animal_type, @RequestParam("animal_age") int animal_age){
        ModelAndView mv = new ModelAndView("redirect:/");
        AppAnimals animalToSave;
        if(!id.isEmpty())
        {
            Optional<AppAnimals> animals = appRepo.findById(Integer.parseInt(id));
            animalToSave = animals.get();
        }
        else
        {
            animalToSave = new AppAnimals();
        }
        animalToSave.setAnimalName(animal_name);
        animalToSave.setAnimalType(animal_type);
        animalToSave.setAnimalAge(animal_age);
        appRepo.save(animalToSave);
        mv.addObject("list", appRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        appRepo.deleteById(id);
        return mv;
    }

}
