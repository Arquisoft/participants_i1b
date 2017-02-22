package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Controller
public class CitizenController {
  
  /**
   * /get-by-email  --> Return the id for the user having the passed email.
   * 
   * @param email The email to search in the database.
   * @return The user id or a message error if the user is not found.
   */
  @RequestMapping("/get-by-email")
  @ResponseBody
  public Citizen getByEmail(String email) {
    Citizen user=null;
    try {
      user = citizenDao.findByEmail("email").get(0);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
    return user;
  }
  
  @Autowired
  private CitizenDao citizenDao;
  
} // class UserController
