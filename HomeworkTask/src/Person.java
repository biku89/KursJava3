public class Person {
    private String name;
    private String lastName;
    private String project;

    public Person(String name, String lastName, String project) {
        this.name = name;
        this.lastName = lastName;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Imie " + name + " Nazwisko " + lastName;
    }
}
