package com.example.demo.local.databaseConnectivity.Entity;

import javax.persistence.*;

@Entity
@Table(name = "customer_details")
public class UserDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String name;
    private String mobile_number;
    private String email;

    public UserDetailsEntity() {
    }

    public UserDetailsEntity(int id, String name, String mobile_number, String email) {
        this.id = id;
        this.name = name;
        this.mobile_number = mobile_number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getEmail() {
        return email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDetailsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
