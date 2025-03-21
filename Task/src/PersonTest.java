public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Kasia", 1998);
        Person person1 = new Person("ASia", 2002);
        System.out.println(person.returnAge());
        System.out.println(person.returnName());

        Person starsza = Person.returnTheOlderPerson(person, person1);
        System.out.println("Starsza jest " + person.returnName());

        Person [] persons = {person,person1};
        Person najstarsza = Person.returnTheMostOldPerson(persons);
        System.out.println("Najstarsza " + najstarsza.returnName());

    }
}
