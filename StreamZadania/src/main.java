import java.util.*;
import java.util.stream.Collectors;

enum Job {
    JAVA_DEVELOPER,
    GROOVY_DEVELOPER,
    SCALA_DEVELOPER,
    KOTLIN_DEVELOPER;
}

class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Double salary;
    private Integer age;
    private Job job;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String email, Double salary, Integer age, Job job) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.age = age;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", job=" + job +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(salary, user.salary) &&
                Objects.equals(age, user.age) &&
                job == user.job;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, salary, age, job);
    }
}

class main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1L, "Ada", "Antczak", "a_antczak@email.com", 3456.5, 20, Job.JAVA_DEVELOPER),
                new User(2L, "Beata", "Byk", "b_byk@email.com", 11223.5, 33, Job.SCALA_DEVELOPER),
                new User(3L, "Czesław", "Cios", "c_cios@email.com", 6500D, 33, Job.JAVA_DEVELOPER),
                new User(4L, "Daria", "Chodkowska", "d_chodkowska@email.com", 2344.3, 40, Job.JAVA_DEVELOPER),
                new User(5L, "Artur", "Boski", "a_boski@email.com", 8798.1, 21, Job.KOTLIN_DEVELOPER),
                new User(6L, "Grzegorz", "Cyrych", "g_cytych@email.com", 12333D, 25, Job.GROOVY_DEVELOPER),
                new User(7L, "Igor", "Drzewicki", "i_drzewicki@email.com", 12333D, 26, Job.JAVA_DEVELOPER),
                new User(8L, "Lidia", "Figura", "l_figura@email.com", 1243D, 28, Job.SCALA_DEVELOPER),
                new User(9L, "Norbert", "Gość", "n_gosc@email.com", 12322D, 45, Job.GROOVY_DEVELOPER),
                new User(10L, "Urszula", "Grotkowska", "u_grotkowska@email.com", 11333D, 30, Job.SCALA_DEVELOPER)

        );
        List<User> highSalary = users.stream()
                .filter(user -> user.getSalary() > 5000)
                .collect(Collectors.toList());

        System.out.println(highSalary);
        System.out.println("Wypisz email");
        printEmail(users);
        System.out.println("Email do stringa");
        System.out.println(allEmailToString(users));
        System.out.println("Pracownicy even + java");
        System.out.println(evenAgeJavaDev(users));
        System.out.println("statystki");
        System.out.println(elementaryStat(users));

        System.out.println("WYwietla id1");
        System.out.println(firstUser(users, 1));

        System.out.println("Wiek większy niż 25");
        System.out.println(moreThan25yo(users));
        System.out.println("Dowolny osoba wiek = 33");
        System.out.println(ageEqual33(users));
        System.out.println("Wszyskie osoby co mają wiek 33");
        allUsersAge33(users);
        System.out.println("Zwiększenie wypłaty o 500");
        increaseSalary(users);
        System.out.println("Imiona z literą a ");
        System.out.println(nameContainsA(users));

    }

    public static void printEmail(List<User> users) {
        users.stream().map(user -> user.getEmail()).forEach(System.out::println);
    }

    public static String allEmailToString(List<User> users) {
        return users.stream().map(User::getEmail).collect(Collectors.joining(", "));
    }

    public static long evenAgeJavaDev(List<User> users) {
        return users.stream().filter(user -> user.getAge() % 2 == 0 && user.getJob() == Job.JAVA_DEVELOPER).count();
    }

    public static DoubleSummaryStatistics elementaryStat(List<User> users) {
        return users.stream().mapToDouble(User::getSalary).summaryStatistics();
    }

    public static Optional<User> firstUser(List<User> users, long id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }

    public static Optional<User> moreThan25yo(List<User> users) {
        return users.stream().filter(user -> user.getAge() > 25).findFirst(); //Czy tutaj powiniem uzyć findAny ?
    }

    public static Optional<User> ageEqual33(List<User> users) {
        return users.stream().filter(user -> user.getAge() == 33).findAny();
    }

    public static void allUsersAge33(List<User> users) {
        users.stream().filter(user -> user.getAge() == 33).forEach(System.out::println);
    }

    public static void increaseSalary(List<User> users) {
        users.stream()
                .map(user -> user.getSalary() + 500).forEach(System.out::println);
    }

    public static List<User> nameContainsA(List<User> users) {
        return users.stream().filter(user -> user.getFirstName().toLowerCase().contains("a")).toList();
    }


}