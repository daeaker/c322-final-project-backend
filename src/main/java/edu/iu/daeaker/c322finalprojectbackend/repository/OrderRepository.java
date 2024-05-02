package edu.iu.daeaker.c322finalprojectbackend.repository;

import edu.iu.daeaker.c322finalprojectbackend.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
