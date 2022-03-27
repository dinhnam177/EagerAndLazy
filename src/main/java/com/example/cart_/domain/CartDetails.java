package com.example.cart_.domain;

import javax.persistence.*;

@Entity
@Table(name = "cart_details")
public class CartDetails {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cart")
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Product product;

    public CartDetails() {
        // TODO document why this constructor is empty
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartDetails{" +
                "id=" + id +
                ", cart=" + cart.getId() +
                ", product=" + product.getId() +
                '}';
    }
}
