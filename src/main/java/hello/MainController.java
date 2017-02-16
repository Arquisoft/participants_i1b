package hello;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Citizen;

@Controller
public class MainController {

    @RequestMapping("/")
    public String landing(Model model) {
    	model.addAttribute("citizen", new Citizen("pablo"
    			,"roncero"
    			,new Date()
    			,""
    			,""
    			,""
    			,""
    			,0
    			)
    	);
        return "index";
    }
    
    @RequestMapping("/hola")
    public String hola(Model model) {
    	model.addAttribute("nombre", "Luis");
        return "saludo";
    }

}