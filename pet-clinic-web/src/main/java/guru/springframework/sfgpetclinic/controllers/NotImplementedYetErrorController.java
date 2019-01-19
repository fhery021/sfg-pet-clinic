package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ferenc on 1/19/2019.
 */
@Controller
public class NotImplementedYetErrorController {

    @RequestMapping("/oups")
    public String oopsPage(){
        return "notImplemented";
    }
}
