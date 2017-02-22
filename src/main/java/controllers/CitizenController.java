package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Citizen;
import repository.CitizenDao;
@Service
public class CitizenController {
  @RequestMapping("/get-by-email")
  @ResponseBody
  public Citizen getParticipant(String email, String password) throws Exception {
    Citizen user= new Citizen();
    try {
      user = citizenDao.findByEmailAndPassword(email, password);
      if(user==null){
    	  throw new NullPointerException("User Not Found");
      }
    }
    catch (Exception ex) {
      throw new Exception("Problems Login user: " + user.toString());
    }
    return user;
  }
  
  @Autowired
  private CitizenDao citizenDao;
  
} // class UserController
