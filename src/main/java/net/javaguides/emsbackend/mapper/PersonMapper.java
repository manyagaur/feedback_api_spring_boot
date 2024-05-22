package net.javaguides.emsbackend.mapper;

import net.javaguides.emsbackend.dto.PersonDto;
import net.javaguides.emsbackend.entity.Person;

public class PersonMapper {
	
	public static PersonDto mapToPersonDto(Person person) {
		return new PersonDto(
				person.getId(),
				person.getName(),
				person.getEmail(),
				person.getFeedback()
				);
		
	}
	
	public static Person mapToPerson(PersonDto personDto) {
		return new Person(
				personDto.getId(),
				personDto.getName(),
				personDto.getEmail(),
				personDto.getFeedback()
				);
				
		
	}

}
