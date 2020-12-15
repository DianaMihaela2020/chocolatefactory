package com.chocolate.Lindt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String formularCiocolataPersonalizata() {
        return "formular_ciocolata_personalizata";
    }

// creearea metodei de ciocolata personalizata


    @RequestMapping( value= "/creazaCiocolata", method = RequestMethod.POST)

    public String creazaCiocolata(@RequestParam(name = "sortiment",required = false) String sortiment,
                                @RequestParam(name ="aroma", required= false)String aroma,
                                @RequestParam(name ="ambalajModel", required = false) String ambalajModel,
                                @RequestParam(name = "cutieCapac", required = false) String cutieCapac,
                                @RequestParam(name = "culoareAmbalaj", required = false) String culoareAmbalaj,
                                @RequestParam( name ="culoareImprimata", required = false)String culoareImprimata,
                                @RequestParam(name ="accesoriu", required = false)String accesoriu ){

      System.out.println( sortiment + aroma +ambalajModel +cutieCapac + culoareAmbalaj + culoareImprimata + accesoriu);
      return "";
    }

}
