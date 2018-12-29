package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ferenc on 12/30/2018.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "vets/index", "/vets/index.index.html"})
    public String listVets(){


        return "vets/index";
    }
}
