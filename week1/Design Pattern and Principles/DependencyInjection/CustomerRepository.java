public interface CustomerRepository {
    String findCustomerById(int id);
}
class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        // Simulate a database fetch
        if (id == 1) {
            return "Customer: John Doe";
        } else {
            return "Customer not found";
        }
    }
}
