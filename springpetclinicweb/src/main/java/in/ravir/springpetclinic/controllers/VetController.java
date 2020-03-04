package in.ravir.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ravir.springpetclinic.service.VetService;

/**
 * VetController
 */
@Controller
public class VetController {

    private final VetService vetService;
  

    @RequestMapping({"/vets", "vets/index.html", "vets/index"})
    public String listVets( Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
    
}