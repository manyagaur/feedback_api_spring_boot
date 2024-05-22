package net.javaguides.emsbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.javaguides.emsbackend.dto.PersonDto;
import net.javaguides.emsbackend.service.PersonService;


@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api/person")

public class PersonController {
	
	private PersonService personService;
	
	@PostMapping
	public ResponseEntity<PersonDto> createPerson(@RequestBody PersonDto personDto){
		PersonDto savedPerson= personService.createPerson(personDto);
		return new ResponseEntity<>(savedPerson,HttpStatus.CREATED);
		
	}

}
