package net.osmd.models;

import net.osmd.models.enums.RoleEnum;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by WEO on 9/12/16.
 */

@Entity
@Table(name = "USER")
public class Users implements Serializable {

    private static final long serialVersionUID = -278687281884895116L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", length = 11, nullable = false)
    private int id;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @Column(name = "SURNAME", nullable = false, length = 30)
    private String surname;

    @Column(name = "ADDRESS", nullable = false, length = 50)
    private String address;

    @Column(name = "TELEPHONE", nullable = false, length = 30)
    private String telephone;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "ROLE")
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    public Users() {
    }

    public Users(String name, String surname, String address, String telephone, String email, RoleEnum role) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.role = role;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}