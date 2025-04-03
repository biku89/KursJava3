import java.util.ArrayList;
import java.util.List;

public class EmployeeList{
    List<Person> employee = new ArrayList<>();

    public void addEmploye(Person person){
        employee.add(person);
    }

    public void employeeAlphaProject(){
        System.out.println("Osoby pracujące nad Alpha");
        employee.stream()
                .filter(employee -> employee.getProject()
                        .contains("Alpha"))
                .forEach(System.out::println);
    }
    public void uniqueProject(){
        System.out.println("Unikalne projektu");
        employee.stream()
                .map(employee -> employee.getProject())
                .distinct()
                .forEach(System.out::println);
    }
}

