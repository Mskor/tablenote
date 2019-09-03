package su.shafran.tablenote.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import su.shafran.tablenote.document.MenuItem;

public interface MenuItemRepository extends MongoRepository<MenuItem, String> {
    MenuItem findByName(String name);
}
