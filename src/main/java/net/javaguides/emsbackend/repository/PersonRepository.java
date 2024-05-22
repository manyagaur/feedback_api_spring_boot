package net.javaguides.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.emsbackend.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
	

}
