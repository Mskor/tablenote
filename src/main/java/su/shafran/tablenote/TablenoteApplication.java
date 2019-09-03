package su.shafran.tablenote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import su.shafran.tablenote.repository.MenuItemRepository;
import su.shafran.tablenote.document.MenuItem;

@SpringBootApplication
public class TablenoteApplication implements CommandLineRunner {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public static void main(String[] args) {
        SpringApplication.run(TablenoteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        menuItemRepository.deleteAll();

        menuItemRepository.save(new MenuItem("Hookah", 800));
        menuItemRepository.save(new MenuItem("Tea", 300));

        // fetch all customers
        System.out.println("MenuItems found with findAll():");
        System.out.println("-------------------------------");
        for (MenuItem customer : menuItemRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();
    }
}
