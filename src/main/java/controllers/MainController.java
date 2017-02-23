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

import java.util.Date;

@Controller
public class MainController {

	@Autowired
	private CitizenController citizenController;

	@RequestMapping("/")
	public String landing() {
		return "index";
	}

	@GetMapping(value = "/login")
	public String login(HttpServletRequest request, Model model) {

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		try {
			Citizen citizen = citizenController.getParticipant(login, password);
			model.addAttribute("citizen", citizen);
			return "info";
		} catch (Exception e) {
			model.addAttribute("citizen", new Citizen(" "," ",new Date(),login," "," "," ",5));
			return "error";
		}
		
	}
	
	@RequestMapping("/indexJSON")
	public String indexJSON(Model model) {
		return "indexJSON";
	}
	
	@GetMapping(value = "/loginJSON")
	public ResponseEntity<Citizen> loginJSON(HttpServletRequest request) {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		try {
			Citizen citizen = citizenController.getParticipant(login, password);
			return new ResponseEntity<Citizen>(citizen, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(value = "/info", produces = "application/json")
	public String mostrarInfo(@RequestBody Model model) {
		return "info";
	}

	@RequestMapping("/hola")
	public String hola(Model model) {
		model.addAttribute("nombre", "Luis");
		return "saludo";
	}

}