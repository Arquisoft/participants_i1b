package model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenDao extends JpaRepository<Citizen, Long> {
	
	Citizen findByEmail(String email);
}