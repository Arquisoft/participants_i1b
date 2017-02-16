package participants.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Citizen;
import model.CitizenDao;
import participants.GetParticipantInfo;

@Service("getParticipantInfo")
public class GetParticipantInfoImpl implements GetParticipantInfo{

	@Autowired
	CitizenDao citizenDao;

	@PostMapping("/info")
	public String getParticipantInfo(@RequestBody String email, @RequestBody String password) throws Exception {
		System.out.println("!!!!!!!!--------------------------------------------------------------------------------------!!!!!!!!!!!");
		Citizen user = citizenDao.findByEmail(email);
		
		if(user == null)
			throw new Exception("User not found.");
		
		if(!user.getPassword().equals(password)){
			throw new Exception("The password is wrong.");
		}
		
		return user.toString();
	}
}
