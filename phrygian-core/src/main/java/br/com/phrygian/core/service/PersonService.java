package br.com.phrygian.core.service;


import java.util.List;

import br.com.phrygian.core.model.Person;

public interface PersonService {
    
    public void addPerson(Person person);
    public List<Person> listPeople();
    public void removePerson(Integer id);
}
