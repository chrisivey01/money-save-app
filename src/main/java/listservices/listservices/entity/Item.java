package listservices.listservices.entity;

import javax.persistence.*;

@Entity
@Table(name="Starbucks")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;
    @Column(name = "item")
    String item;
    @Column(name = "days_without_item")
    int days_without_item;
    @Column(name = "money_saved_without_item")
    int money_saved_without_item;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getDays_without_item() {
        return days_without_item;
    }

    public void setDays_without_item(int days_without_item) {
        this.days_without_item = days_without_item;
    }

    public int getMoney_saved_without_item() {
        return money_saved_without_item;
    }

    public void setMoney_saved_without_item(int money_saved_without_item) {
        this.money_saved_without_item = money_saved_without_item;
    }
}
