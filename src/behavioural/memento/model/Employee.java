package behavioural.memento.model;

import java.io.Serializable;

/**
 * originator
 */
public class Employee{

    private String name;
    private String address;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento memento){
        this.name = memento.getName();
        this.phone = memento.getPhone();
    }
}
