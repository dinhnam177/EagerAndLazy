package com.example.cart_.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.REMOVE, orphanRemoval = true,fetch = FetchType.LAZY)
    private List<CartDetails> cartDetails = new ArrayList<>();

    public Cart() {
    }

    public Cart(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cart(int id, String name, List<CartDetails> cartDetails) {
        this.id = id;
        this.name = name;
        this.cartDetails = cartDetails;
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

    public List<CartDetails> getCartDetails() {
        return cartDetails;
    }

    public void setCartDetails(List<CartDetails> cartDetails) {
        this.cartDetails = cartDetails;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
