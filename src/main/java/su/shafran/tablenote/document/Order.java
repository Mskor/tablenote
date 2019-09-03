package su.shafran.tablenote.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    private Table table;

    private Map<MenuItem, Integer> orders;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Map<MenuItem, Integer> getOrders() {
        return orders;
    }

    public void setOrders(Map<MenuItem, Integer> orders) {
        this.orders = orders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
