package com.cts.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.cts.customer.controller.PetController.CustomerEndPoints.INDEX_URL;
import static com.cts.customer.controller.PetController.CustomerEndPoints.ROOT;

@Controller
public class PetController {

    public static final String INDEX_PAGE = "index";

    @Autowired
    private PetRepository repository;

    @RequestMapping(value = {ROOT, INDEX_URL})
    public String getPets() {
        repository.save(new Cats("test"+System.currentTimeMillis()));
        return INDEX_PAGE;
    }

    public interface CustomerEndPoints {
        String INDEX_URL = "/index";
        String ROOT = "/";
    }
}
