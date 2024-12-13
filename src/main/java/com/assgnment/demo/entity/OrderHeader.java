package com.assgnment.demo.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name="Order_Header")
public class OrderHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Temporal(TemporalType.DATE)
    @Column(name = "order_date", nullable = false)
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "shipping_contact_mech_id", nullable = false)
    private ContactMech shippingContactMech;

    @ManyToOne
    @JoinColumn(name = "billing_contact_mech_id", nullable = false)
    private ContactMech billingContactMech;
}
