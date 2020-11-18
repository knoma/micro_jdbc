package knoma.web;

import io.micronaut.http.annotation.*;
import knoma.web.repo.PersonRepository;

import javax.inject.Inject;

@Controller("/person")
public class PersonController {

    private PersonRepository repo;

    @Inject
    public PersonController(PersonRepository personRepository) {
        this.repo = personRepository;
    }

    @Get(uri="/", produces="application/json")
    public Person get() {
        Person test = repo.save(new Person("test", "test123@apple.com"));

        return test;
    }
}