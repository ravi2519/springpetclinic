package in.ravir.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ravir.springpetclinic.service.OwnerService;

/**
 * OwnersControllers
 */
@Controller
public class OwnersControllers {

    private final OwnerService ownerService;

    public OwnersControllers(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    
}