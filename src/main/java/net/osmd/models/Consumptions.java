package net.osmd.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by WEO on 11/22/16.
 */

@Entity
@Table(name = "CONSUMPTION")
public class Consumptions implements Serializable{
    private static final long serialVersionUID = 255806888504989117L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID", length = 11, nullable = false)
    private int id;

    @Column (name = "LV", length = 11, nullable = false)
    private int lv;

    @Column (name = "RTV", length = 11, nullable = false)
    private int rtv;

    @Column (name = "CONSUMED", length = 11, nullable = false)
    private int consumed;

    @Column (name = "TOTAL_CONSUMED", length = 11, nullable = false)
    private int totalconsumed;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "SERVICE_ID")
    private Services services;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "USER_ID")
    private Users users;

    public Consumptions() {
    }

    public Consumptions(int lv, int rtv, int consumed, int totalconsumed, Services services, Users users) {
        this.lv = lv;
        this.rtv = rtv;
        this.consumed = consumed;
        this.totalconsumed = totalconsumed;
        this.services = services;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getRtv() {
        return rtv;
    }

    public void setRtv(int rtv) {
        this.rtv = rtv;
    }

    public int getConsumed() {
        return consumed;
    }

    public void setConsumed(int consumed) {
        this.consumed = consumed;
    }

    public int getTotalconsumed() {
        return totalconsumed;
    }

    public void setTotalconsumed(int totalconsumed) {
        this.totalconsumed = totalconsumed;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
