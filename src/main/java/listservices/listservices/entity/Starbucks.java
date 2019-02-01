package listservices.listservices.entity;

import javax.persistence.*;

@Entity
@Table(name="Starbucks")
public class Starbucks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idStarbucks")
    Integer idStarbucks;
    @Column(name="daysWithoutStarbucks")
    int daysWithoutStarbucks;
    @Column(name="moneySavedWithoutStarbucks")
    int moneySavedWithoutStarbucks;


    public Integer getIdStarbucks() {
        return idStarbucks;
    }

    public void setIdStarbucks(Integer idStarbucks) {
        this.idStarbucks = idStarbucks;
    }

    public int getDaysWithoutStarbucks() {
        return daysWithoutStarbucks;
    }

    public void setDaysWithoutStarbucks(int daysWithoutStarbucks) {
        this.daysWithoutStarbucks = daysWithoutStarbucks;
    }

    public int getMoneySavedWithoutStarbucks() {
        return moneySavedWithoutStarbucks;
    }

    public void setMoneySavedWithoutStarbucks(int moneySavedWithoutStarbucks) {
        this.moneySavedWithoutStarbucks = moneySavedWithoutStarbucks;
    }
}
