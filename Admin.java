import oopEstore.exceptions.IncorrectPasswordException;
import java.util.ArrayList;
import java.util.List;

public final class Admin extends User {
    private List<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;

    
