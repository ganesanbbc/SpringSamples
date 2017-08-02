package com.cts.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.cts.customer.controller.PetController.CustomerEndPoints.GET_PETS;
import static com.cts.customer.controller.PetController.CustomerEndPoints.INDEX_URL;
import static com.cts.customer.controller.PetController.CustomerEndPoints.ROOT;

@Controller
public class PetController {

    public static final String INDEX_PAGE = "index";

    @Autowired
    private PetRepository repository;

    @RequestMapping(value = {ROOT, INDEX_URL})
    public String addPets() {
        repository.save(new Cats("test"+System.currentTimeMillis()));
        return INDEX_PAGE;
    }


    @RequestMapping(value = {GET_PETS})
    public @ResponseBody List<Cats> getPets() {
        return repository.findAll();
    }



    public interface CustomerEndPoints {
        String INDEX_URL = "/index";
        String GET_PETS = "/pets";
        String ROOT = "/";
    }


}
