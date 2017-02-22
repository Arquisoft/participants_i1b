package model;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CitizenDao extends JpaRepository<Citizen, Long> {
	
	Citizen findByEmail(String email);
}