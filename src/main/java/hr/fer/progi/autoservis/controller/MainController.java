package hr.fer.progi.autoservis.controller;

import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final BuildProperties build_properties;

    public MainController(BuildProperties buildProperties){
        this.build_properties = buildProperties;
    }

    @GetMapping("/page")
    public String page(Model model){
        String message = "THIS IS DYNAMIC TEXT";
        model.addAttribute("message", message);
        model.addAttribute("buildNumber", build_properties.getVersion());

        return "dynamic";
    }
}
