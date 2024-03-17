import oopEstore.exceptions.IncorrectPasswordException;
import java.util.ArrayList;
import java.util.List;

public final class Admin extends User {
    private List<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;

    public Admin(int id, String name, int age, String emailAddress, Address homeAddress, String password, String phone) {
        super(id, name, age, emailAddress, homeAddress, password, phone);
    }

    
