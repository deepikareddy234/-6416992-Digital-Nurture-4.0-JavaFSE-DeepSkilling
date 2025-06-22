package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String customerId) {
        // Simulating a database lookup
        return "Customer ID: " + customerId + ", Name: Yerlam Sai Deepika";
    }
}

