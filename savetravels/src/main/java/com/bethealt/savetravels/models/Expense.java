package com.bethealt.savetravels.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
@Table(name="expenses")

public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 5, max = 200, message ="Expense Name must be at least 5 characters.")
    private String name;

    @NotNull
    @Size(min = 5, max = 200, message ="Vendor Name must be at least 5 characters.")
    private String vendor;

    @NotNull(message = "Amount must be greater than 0.00")
    @Min(1)
    @Max(999999)
    private Double amount;

    @NotNull
    @Size(min = 5, max = 200, message = "Description must be at least 5 characters.")
    private String description;

    @Column(updatable=false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    // CONSTRUCTORS
    public Expense () {
    }

    public Expense(String name, String vendor, Double amount, String desc) {
        this.name = name;
        this.vendor = vendor;
        this.amount = amount;
        this.description = desc; 
    }

    // GETTERS & SETTERS
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

}