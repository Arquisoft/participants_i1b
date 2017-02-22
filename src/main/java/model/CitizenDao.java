package model;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Transactional
public interface CitizenDao extends JpaRepository<Citizen, Long> {
  
<<<<<<< HEAD
	Citizen findByEmail(String email);
=======
	Citizen findByEmailAndPassword(String email, String password);
>>>>>>> 507957171ab10e6d02cc8f16a2f7eb6b09b52088
} 
