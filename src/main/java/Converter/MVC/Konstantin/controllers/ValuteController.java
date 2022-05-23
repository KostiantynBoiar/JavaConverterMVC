package Converter.MVC.Konstantin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/converter")
public class ValuteController {

    @GetMapping()
    public String main(){
        return "converter";
    }

}
