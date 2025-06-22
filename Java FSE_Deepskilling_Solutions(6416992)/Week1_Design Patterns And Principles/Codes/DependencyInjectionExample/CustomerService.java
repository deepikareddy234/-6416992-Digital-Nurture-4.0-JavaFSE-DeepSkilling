package DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String customerId) {
        String customerInfo = repository.findCustomerById(customerId);
        System.out.println("Customer Details: " + customerInfo);
    }
}

