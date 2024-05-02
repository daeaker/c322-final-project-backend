package edu.iu.daeaker.c322finalprojectbackend.repository;

import edu.iu.daeaker.c322finalprojectbackend.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends CrudRepository<Flower, Integer> {
}
