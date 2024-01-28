package ma.emsi.customerfrontthymeleafapp;

import ma.emsi.customerfrontthymeleafapp.entities.Customer;
import ma.emsi.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("omar").email("omar@gmail.com").build());
            customerRepository.save(Customer.builder().name("said").email("said@gmail.com").build());
            customerRepository.save(Customer.builder().name("fahd").email("fahd@gmail.com").build());
        };
    }
}
