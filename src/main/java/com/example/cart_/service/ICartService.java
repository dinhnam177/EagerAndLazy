package com.example.cart_.service;


import com.example.cart_.domain.Cart;

import java.util.List;

public interface ICartService {
    List<Cart> findAll();
}
