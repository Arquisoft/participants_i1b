package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
    
    @RequestMapping("/holaLuis")
    public String hola(Model model) {
    	model.addAttribute("nombre", "Luis");
        return "saludo";
    }
    
    @RequestMapping("/")
    public String pass(Model model) {
        return "loggin";
    }

}