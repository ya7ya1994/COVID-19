package world.virus.COVID19.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import world.virus.COVID19.services.CoronaVirusService;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusService coronaVirusService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("totalReportedCases",coronaVirusService.getTotalReportedCases());
        model.addAttribute("locationStats"
                , coronaVirusService.getAllStats());
        return "home";
    }

}
