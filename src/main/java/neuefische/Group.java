package neuefische;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Group {
    private List<Person> persons;

    public Group() {
        persons = new ArrayList<>();
    }

    public Optional<Person> getPersonById(int id){
        for (Person person: persons){
            if(person.id() == id){
                return Optional.of(person);
            }
        }

        return Optional.empty();
    }

    public Optional<Person> getPersonByName(String name){
        for (Person person: persons){
            if(person.name().equals(name)){
                return Optional.of(person);
            }
        }

        return Optional.empty();
    }

    public List<Person> getPersonsByFavoriteWeekday(DaysOfWeek day){
        return persons.stream().filter(person -> person.favoriteDay().equals(day)).toList();
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public int countPersonByGender(Gender gender){
        return (int) persons.stream().filter(person -> person.gender().equals(gender)).count();
    }
}
