package su.shafran.tablenote.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menuitems")
public class MenuItem {

    @Id
    private String id;

    private String name;

    private Integer price;

    public MenuItem() {}

    public MenuItem(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString() {
        return String.format("MenuItem[id=%s, name=%s, price=%s]", id, name, price);
    }
}
