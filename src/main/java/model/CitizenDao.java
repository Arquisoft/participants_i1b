package model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CitizenDao extends CrudRepository<Citizen, Long> {

  /**
   * Return the user having the passed email as
   * parameter, or null if no user is found.
   * 
   * @param email the user email.
   */
   public Citizen findByEmail(String email);

}