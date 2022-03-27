package com.example.cart_.service;

import com.example.cart_.domain.Cart;
import com.example.cart_.reponsitory.ICartReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartService implements ICartService{

    @Autowired
    ICartReponsitory cartReponsitory;

    @Override
    public List<Cart> findAll() {
        return cartReponsitory.findAll();
    }
}
