package DBManagement;

import DBManagement.impl.GetParticipantImpl;

public interface GetParticipant {

	static GetParticipantImpl getParticipantInfo() throws Exception{
		return new GetParticipantImpl();
	}
}
