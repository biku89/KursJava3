public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public Person(String name) {
        this.yearOfBirth = 1990;
    }

    public String returnName(){
        return name;
    }

    public int returnAge(){
        int currentYear = java.time.Year.now().getValue();
        return currentYear - yearOfBirth;
    }
    public static Person returnTheOlderPerson(Person person1, Person person2){
        return (person1.yearOfBirth < person2.yearOfBirth) ? person1 : person2;
    }
    public static Person returnTheMostOldPerson(Person[] persons){
        Person mostOldest = persons[0];
        for (Person person : persons){
            if (person.yearOfBirth < mostOldest.yearOfBirth){
                mostOldest = person;
            }
        }
        return mostOldest;
    }
}
