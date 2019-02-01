package listservices.listservices.repository;

import listservices.listservices.entity.Starbucks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarbucksRepository extends CrudRepository<Starbucks, Integer> {

}
