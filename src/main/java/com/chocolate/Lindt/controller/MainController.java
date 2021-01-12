package com.chocolate.Lindt.controller;

import com.chocolate.Lindt.model.CiocolataPersonalizata;
import com.chocolate.Lindt.service.CiocolataPersonalizataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private CiocolataPersonalizataService service;

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


    @RequestMapping(
            value = "/creeazaCiocolata",
            method = RequestMethod.POST
    )
    public String creeazaCiocolata(@RequestParam(name = "sortiment") int sortiment,
                                   @RequestParam(name = "aroma") int aroma,
                                   @RequestParam(name = "ambalajModel") int ambalajModel,
                                   @RequestParam(name = "culoareAmbalaj") int culoareAmbalaj,
                                   @RequestParam(name = "culoareImprimata") int culoareImprimata,
                                   @RequestParam(name = "accesoriu", required = false) Integer accesoriu) {

        System.out.println("Utilizatorul a comandat o ciocolata personalizata, avand sortimentul cu id-ul: " +sortiment + ", aroma cu id-ul " + aroma + ", modelul ambalajului cu id-ul " + ambalajModel + ", avand culoarea cu id-ul " + culoareImprimata);

        CiocolataPersonalizata ciocolataComandata = new CiocolataPersonalizata();
        if (accesoriu !=null){
            ciocolataComandata.setIdAccesoriu(accesoriu);
            System.out.println("Accesoriu extra are id-ul " + accesoriu );
        }

        ciocolataComandata.setIdAmbalaj(ambalajModel);
        ciocolataComandata.setIdCuloareAmbalaj(culoareAmbalaj);
        ciocolataComandata.setIdAroma(aroma);
        ciocolataComandata.setIdSortiment(sortiment);
        ciocolataComandata.setIdCuloareText(culoareImprimata);

        service.save(ciocolataComandata);

        return "confirmare_comanda";
    }

}
