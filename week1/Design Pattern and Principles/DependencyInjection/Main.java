public class Main {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository repository = new CustomerRepositoryImpl();
        
        // Inject the repository into the service
        CustomerService service = new CustomerService(repository);
        
        // Use the service
        service.displayCustomer(1);   // Output: Customer: John Doe
        service.displayCustomer(2);   // Output: Customer not found
    }
}
