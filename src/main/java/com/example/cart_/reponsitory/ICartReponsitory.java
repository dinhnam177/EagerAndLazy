package com.example.cart_.reponsitory;

import com.example.cart_.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICartReponsitory extends JpaRepository<Cart, String> {
}
