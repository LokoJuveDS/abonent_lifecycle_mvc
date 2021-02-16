package com.yegorpriimak.spring.mvc.entity;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "subscribers")
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "msisdn")
    private String msisdn;
    @Column(name = "balance")
    private double balance;
    @Column(name = "status")
    private boolean status;

    public Subscriber() {
    }

    public Subscriber(String firstName, String lastName, String msisdn, double balance, boolean status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.msisdn = msisdn;
        this.balance = balance;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMsisdn() {
        if (msisdn == null) {
            return msisdn;
        } else {
            String phoneNumber = msisdn.replaceFirst("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1 ($2) $3-$4-$5");
            return phoneNumber;
        }
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
