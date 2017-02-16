package DBManagements;

import DBManagements.impl.GetParticipantImpl;

public interface GetParticipant {

	static GetParticipantImpl getParticipantInfo() throws Exception{
		return new GetParticipantImpl();
	}
}
