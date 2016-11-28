package net.osmd.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by WEO on 11/22/16.
 */

@Entity
@Table (name = "PAYMENT")
public class Payments implements Serializable{
    private static final long serialVersionUID = 8213319859467167184L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    private int id;

    @Column (name = "PAID")
    private Double paid;

    @Column (name = "PAYMENT_DATE")
    private Date paymentDate;

    @ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn (name = "CONSUMPTION_ID")
    private Consumptions consumptions;

    public Payments() {
    }

    public Payments(Double paid, Date paymentDate, Consumptions consumptions) {
        this.paid = paid;
        this.paymentDate = paymentDate;
        this.consumptions = consumptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Consumptions getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(Consumptions consumptions) {
        this.consumptions = consumptions;
    }
}

