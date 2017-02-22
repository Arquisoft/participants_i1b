package model;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Transactional
public interface CitizenDao extends JpaRepository<Citizen, Long> {
  
	Citizen findByEmailAndPassword(String email, String password);
} 
