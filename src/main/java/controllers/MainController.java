package controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Citizen;

@Controller
public class MainController {

	@Autowired
	CitizenController citizenController;
	
	@RequestMapping("/")
    public String landing() {
        return "index";
    }
    
    @GetMapping(value = "/login")
    public String login(HttpServletRequest request, Model model){

    	String login = request.getParameter("login");
    	String password =  request.getParameter("password");
    	try{
    	Citizen citizen = citizenController.getParticipant(login, password);
    	model.addAttribute("citizen",citizen);
    	/*
    	 * para el JSON habría que cambiar el tipo de return y devolver esto
    	 * return new ResponseEntity<Citizen>(citizen, HttpStatus.OK);
    	 */
    	}catch (Exception e){
    		model.addAttribute("nombre", "Luis");
            return "saludo";
    	}
    	return "info";
    }
    
    @PostMapping(value = "/info", produces="application/json")
    public String mostrarInfo(@RequestBody Model model){
    	return "info";
    }
    
    @RequestMapping("/hola")
    public String hola(Model model) {
    	model.addAttribute("nombre", "Luis");
        return "saludo";
    }
    //JSON response example in /e
    @RequestMapping("/e")
    public ResponseEntity<Citizen> get() {

    	Citizen car = new Citizen();
    	car.setPassword("3333");
        return new ResponseEntity<Citizen>(car, HttpStatus.OK);
    }

}