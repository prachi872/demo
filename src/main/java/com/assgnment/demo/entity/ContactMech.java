package com.assgnment.demo.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name ="Contact_Mech")
public class ContactMech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactMechId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

}
