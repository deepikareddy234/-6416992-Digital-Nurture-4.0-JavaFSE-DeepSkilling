package DependencyInjectionExample;

public class CustomerApp {
    public static void main(String[] args) {
        // Creating dependency manually
        CustomerRepository repo = new CustomerRepositoryImpl();

        // Injecting dependency via constructor
        CustomerService service = new CustomerService(repo);

        // Using the service
        service.getCustomerDetails("6416992");
    }
}

