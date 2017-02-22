package model;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface CitizenDao extends JpaRepository<Citizen, Long> {
	
	Citizen findByEmailAndPassword(String email, String password);
} 
