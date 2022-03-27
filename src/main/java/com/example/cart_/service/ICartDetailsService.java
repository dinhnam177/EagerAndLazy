package com.example.cart_.service;


import com.example.cart_.domain.CartDetails;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICartDetailsService {
    List<CartDetails> finAll();
    void saveAll(List<CartDetails> cartDetails);
    void deleteCart(CartDetails cartDetails);
}
