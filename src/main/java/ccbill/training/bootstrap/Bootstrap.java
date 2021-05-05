package ccbill.training.bootstrap;

import ccbill.training.domain.Category;
import ccbill.training.domain.Customer;
import ccbill.training.domain.Vendor;
import ccbill.training.repositories.CategoryRepository;
import ccbill.training.repositories.CustomerRepository;
import ccbill.training.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;
    private VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, 
                     VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadCustomers();

        loadCategories();

        loadVendors();
    }

    private void loadCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("Data Loaded: " + categoryRepository.count());
    }
    
    private void loadCustomers() {
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstName("Michale");
        customer1.setLastName("Weston");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setFirstName("Sam");
        customer2.setLastName("Axe");
        customerRepository.save(customer2);

        System.out.println("Customers Loaded: " + customerRepository.count());
    }
    
    private void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setId(1L);
        vendor1.setName("Home Fruits");
        vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
        vendor2.setId(2L);
        vendor2.setName("Fun Fresh Fruits Ltd");
        vendorRepository.save(vendor2);

        Vendor vendor3 = new Vendor();
        vendor3.setId(3L);
        vendor3.setName("Nuts for Nuts Company");
        vendorRepository.save(vendor3);

        Vendor vendor4 = new Vendor();
        vendor4.setId(4L);
        vendor4.setName("Exotic Fruits Company");
        vendorRepository.save(vendor4);

        System.out.println("Vendors Loaded: " + vendorRepository.count());
    }
}
