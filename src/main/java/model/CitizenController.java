package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Citizen;
import model.CitizenDao;

@Controller
public class CitizenController {
	
   // Private fields
   @Autowired
   private CitizenDao userDao;
   
   /**
    * Returns the user with the username passed
    */
   @RequestMapping("/get-by-email")
   @ResponseBody
   public Citizen getUserByEmail(String email) {
	   Citizen user = null;
     try {
       user = userDao.findByEmail(email);    
     }
     catch (Exception ex) {
       System.err.println("User" + userDao.findByEmail(email).getFirstName() 
    		   + "not found");
     }
     return user;
   }
   
   /**
    * Updates user Password with the new requested one
    */
   @RequestMapping("/update")
   @ResponseBody
   public String updateUserPassword(String email,String newPassword) {
     try {
       Citizen user = this.getUserByEmail(email);
       user.setPassword(newPassword);
       userDao.save(user);
     }
     catch (Exception ex) {
       return "Error updating the user: " + ex.toString();
     }
     return "User with email" + email + "succesfully updated";
   }
   
}
