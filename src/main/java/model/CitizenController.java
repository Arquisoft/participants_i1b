package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Service
public class CitizenController {
 
  /**
   * /get-by-email  --> Return the id for the user having the passed email.
   * 
   * @param email The email to search in the database.
   * @return The user id or a message error if the user is not found.
 * @throws Exception 
   */
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
