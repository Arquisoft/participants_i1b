package hello;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Citizen;
import model.CitizenController;

@Controller
public class MainController {
	@Autowired
	CitizenController citizenController;
	
    @RequestMapping("/")
    public String landing() {
        return "index";
    }
    
    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model){
    	String login = request.getParameter("login");
    	String password =  request.getParameter("password");
    	try{
    	Citizen citizen = citizenController.getParticipant(login, password);
    	model.addAttribute("citizen",citizen);
    	}catch (Exception e){
    		model.addAttribute("nombre", "Luis");
            return "saludo";
    	}
    	//Citizen citizen = new Citizen(login, login, new Date(), login, login, login, login, 1);
    	

    	return "info";
    }
    
    @PostMapping("/info")
    public String mostrarInfo(Model model){
    	return "info";
    }
    
    @RequestMapping("/hola")
    public String hola(Model model) {
    	model.addAttribute("nombre", "Luis");
        return "saludo";
    }

}