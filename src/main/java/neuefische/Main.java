package neuefische;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1,"john", Gender.MALE, DaysOfWeek.FRIDAY);
        Person person2 = new Person(2,"anna", Gender.FEMALE, DaysOfWeek.SUNDAY);
        Person person3 = new Person(3,"jack", Gender.MALE, DaysOfWeek.SATURDAY);
        Person person4 = new Person(4,"daniel", Gender.DIVERSE, DaysOfWeek.FRIDAY);

        Group group = new Group();
        group.addPerson(person1);
        group.addPerson(person2);
        group.addPerson(person3);
        group.addPerson(person4);

        System.out.println(group.getPersonById(66).orElse(new Person(0, "null", null,null)).favoriteDay());
        System.out.println(group.countPersonByGender(Gender.DIVERSE));
    }


}