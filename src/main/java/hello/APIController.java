package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.User;

@RestController
public class APIController {

    @RequestMapping("/user")
    public UserInfo user() {
        return new UserInfo("pepe",0);
    }
    
    @RequestMapping("/myuser")
    /**
     * Trying to use my own user implementation
     * @return
     */
    public String myuser() {
        return new User("David","Villamil","uo000000@uniovi.es","156166F", "******",20).toString();
    }

}