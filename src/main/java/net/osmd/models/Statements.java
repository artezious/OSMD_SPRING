package net.osmd.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by WEO on 11/22/16.
 */

@Entity
@Table (name = "STATEMENT")
public class Statements implements Serializable{

    private static final long serialVersionUID = 6045706733909562821L;

    @Id
    @GeneratedValue
    @Column (name = "ID")
    private int id;

    @ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CONSUMPTION_ID")
    private Consumptions consumptions;

    @ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "PAYMENT_ID")
    private Payments payments;

    @Column (name = "DEBT")
    private Double debt;

    public Statements() {
    }

    public Statements(Consumptions consumptions, Payments payments, Double debt) {
        this.consumptions = consumptions;
        this.payments = payments;
        this.debt = debt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consumptions getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(Consumptions consumptions) {
        this.consumptions = consumptions;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

}
