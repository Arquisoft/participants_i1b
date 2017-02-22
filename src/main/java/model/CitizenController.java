package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Service
public class CitizenController {
  
  public Citizen getByEmail(String email) {
    Citizen user = new Citizen();
    try {
      user = citizenDao.findByEmail("email");
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
    return user;
  }
  
  @Autowired
  private CitizenDao citizenDao;
  
} // class UserController
