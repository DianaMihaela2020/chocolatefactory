package com.chocolate.Lindt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/brand")
    public String brand() {
        return "brand";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/formular_ciocolata")
    public String formular_ciocolata() {
        return "formular_ciocolata";
    }


    @RequestMapping("/multumiri")
    public String multumiri() {
        return "multumiri";
    }



    @RequestMapping("/produse")
    public String produse() {
        return "produse";
    }


    @RequestMapping("/formular_ciocolata_personalizata")
    public String formular_ciocolata_personalizata() {
        return "formular_ciocolata_personalizata";
    }







}
