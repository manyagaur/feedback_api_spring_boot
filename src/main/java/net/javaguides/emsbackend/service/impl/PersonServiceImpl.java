package net.javaguides.emsbackend.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.emsbackend.dto.PersonDto;
import net.javaguides.emsbackend.entity.Person;
import net.javaguides.emsbackend.mapper.PersonMapper;
import net.javaguides.emsbackend.repository.PersonRepository;
import net.javaguides.emsbackend.service.PersonService;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService{
	
	private PersonRepository personRepository;

	@Override
	public PersonDto createPerson(PersonDto personDto) {
		Person person = PersonMapper.mapToPerson(personDto);
		Person savedPerson= personRepository.save(person);
		// TODO Auto-generated method stub
		return PersonMapper.mapToPersonDto(savedPerson);
	}

}
