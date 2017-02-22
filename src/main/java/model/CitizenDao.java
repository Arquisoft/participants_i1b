package model;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.lang.String;
import model.Citizen;
import java.util.List;

@Transactional
public interface CitizenDao extends CrudRepository<Citizen, Long> {
  
	List<Citizen> findByEmail(String email);
} 
