package behavioural.memento;

import behavioural.memento.model.Caretaker;
import behavioural.memento.model.Employee;

/**
 * Concepts:
 * Restore object to previous state, externalize internal state, undo/rollback, shields complex internals
 *
 * Examples:
 * java.util.Date, java.io.Serializable
 *
 * Pitfalls:
 * Can be expensive,
 * deletes/history
 * exposing information
 *
 * Cantrast:
 * Memento: state captured, independent state, caretaker/History
 * command: request captured, independent request, history side benefit
 *
 * Summary:
 * capture state; can get heavy with history, recreate state, command
 */
public class Demo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee();
        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");

        System.out.println("Employee before save: " + employee);

        caretaker.save(employee);
        employee.setPhone("444-555-6666");
        caretaker.save(employee);

        System.out.println("Employee after save: "+ employee);

        employee.setPhone("333-999-6666");
        caretaker.revert(employee);

        System.out.println("Revert to last save point : " + employee);

        caretaker.revert(employee);

        System.out.println("Revert to original : " + employee);




    }
}
