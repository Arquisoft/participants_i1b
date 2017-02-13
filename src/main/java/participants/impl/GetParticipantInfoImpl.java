package participants.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.CitizenDao;

@Service("getParticipantInfo")
public class GetParticipantInfoImpl {

	@Autowired
	CitizenDao citizenDao;
}
