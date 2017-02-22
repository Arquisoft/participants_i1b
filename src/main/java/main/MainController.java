package main;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Citizen;
import model.CitizenController;
import model.CitizenDao;

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
    	//String login = request.getParameter("login");
    	//String password =  request.getParameter("password");
    	Citizen citizen = citizenController.getByEmail("email");
    	//Citizen citizen = new Citizen(login, login, new Date(), login, login, login, login, 1);
    	model.addAttribute("citizen",citizen);

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