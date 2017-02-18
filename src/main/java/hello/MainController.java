package hello;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Citizen;

@Controller
public class MainController {

    @RequestMapping("/")
    public String landing() {
        return "index";
    }
    
    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model){
    	String login = request.getParameter("login");
    	String password =  request.getParameter("password");
    	
    	Citizen citizen = new Citizen(login, login, new Date(), login, login, login, login, 1);
    	model.addAttribute("citizen",citizen);
    	return "info";
    }
    
    @PostMapping("/login")
    public String mostrarInfo(Model model){
    	return "info";
    }
    
    @RequestMapping("/hola")
    public String hola(Model model) {
    	model.addAttribute("nombre", "Luis");
        return "saludo";
    }

}