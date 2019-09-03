package su.shafran.tablenote.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import su.shafran.tablenote.document.MenuItem;
import su.shafran.tablenote.repository.MenuItemRepository;
import su.shafran.tablenote.rest.error.MenuItemIdMismatchException;
import su.shafran.tablenote.rest.error.MenuItemNotFoundException;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping
    public Iterable findAll() {
        return menuItemRepository.findAll();
    }

    @GetMapping("/name/{menuItemName}")
    public MenuItem findByName(@PathVariable String menuItemName) {
        return menuItemRepository.findByName(menuItemName);
    }

    @GetMapping("/{id}")
    public MenuItem findOne(@PathVariable String id) {
        return menuItemRepository.findById(id).orElseThrow(MenuItemNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MenuItem create(@RequestBody MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        menuItemRepository.findById(id).orElseThrow(MenuItemNotFoundException::new);
        menuItemRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public MenuItem update(@RequestBody MenuItem menuItem, @PathVariable String id) {
        if (menuItem.getId() != id) {
            throw new MenuItemIdMismatchException();
        }
        menuItemRepository.findById(id)
                .orElseThrow(MenuItemNotFoundException::new);
        return menuItemRepository.save(menuItem);
    }
}
