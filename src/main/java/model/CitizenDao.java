package model;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CitizenDao extends CrudRepository<Citizen, Long> {
  
	List<Citizen> findByEmail(String email);
} 
