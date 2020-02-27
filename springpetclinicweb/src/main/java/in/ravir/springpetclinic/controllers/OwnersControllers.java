package in.ravir.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * OwnersControllers
 */
@Controller
public class OwnersControllers {

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listOwners() {
        return "owners/index";
    }
    
}