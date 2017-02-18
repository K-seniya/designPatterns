package behavioural.memento.model;

/**
 * memento
 */
public class EmployeeMemento {

    private String name;
    private String phone;

    public EmployeeMemento(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
