package listservices.listservices.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ItemUsed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Integer userId;
    Integer itemId;
    Integer noOfDaysUsed;

    public ItemUsed() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getNoOfDaysUsed() {
        return noOfDaysUsed;
    }

    public void setNoOfDaysUsed(Integer noOfDaysUsed) {
        this.noOfDaysUsed = noOfDaysUsed;
    }

    @Override
    public String toString() {
        return "ItemUsed{" +
                "id=" + id +
                ", userId=" + userId +
                ", itemId=" + itemId +
                ", noOfDaysUsed=" + noOfDaysUsed +
                '}';
    }
}
