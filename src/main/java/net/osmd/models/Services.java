package net.osmd.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by WEO on 11/22/16.
 */
@Entity
@Table (name = "SERVICE")
public class Services implements Serializable{
    private static final long serialVersionUID = 8296811805617059261L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID", length = 11, nullable = false)
    private int id;

    @Column (name = "SERVICENAME", length = 30, nullable = false)
    private String servicename;

    @Column (name = "TARIFF", nullable = false)
    private Double tariff;

    public Services() {
    }

    public Services(String servicename, Double tariff) {
        this.servicename = servicename;
        this.tariff = tariff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Double getTariff() {
        return tariff;
    }

    public void setTariff(Double tariff) {
        this.tariff = tariff;
    }
}
