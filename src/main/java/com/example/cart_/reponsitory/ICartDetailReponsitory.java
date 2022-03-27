package com.example.cart_.reponsitory;

import com.example.cart_.domain.Cart;
import com.example.cart_.domain.CartDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartDetailReponsitory extends JpaRepository<CartDetails, Integer> {
}
