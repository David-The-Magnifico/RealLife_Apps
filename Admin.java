import oopEstore.exceptions.IncorrectPasswordException;
import java.util.ArrayList;
import java.util.List;

public final class Admin extends User {
    private List<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;

    public Admin(int id, String name, int age, String emailAddress, Address homeAddress, String password, String phone) {
        super(id, name, age, emailAddress, homeAddress, password, phone);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer registerCustomer(String name, int age, String emailAddress, Address homeAddress, String password, String phone) {
        Customer newCustomer = new Customer(++numberOfCustomers, name, age, emailAddress, homeAddress, password, phone);
        customers.add(newCustomer);

        return newCustomer;
    }

    public void removeCustomerAccount(int customerId, String password) {
        Customer customer = findCustomer(customerId);
        validate(customer, password);

        customers.remove(customer);
    }

    
