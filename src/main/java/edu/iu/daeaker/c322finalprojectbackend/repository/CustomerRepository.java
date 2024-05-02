package edu.iu.daeaker.c322finalprojectbackend.repository;

import edu.iu.daeaker.c322finalprojectbackend.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
    Customer findByUsername(String username);
}
