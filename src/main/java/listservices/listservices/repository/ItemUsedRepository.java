package listservices.listservices.repository;

import listservices.listservices.entity.ItemUsed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemUsedRepository extends CrudRepository<ItemUsed, Integer> {

}
