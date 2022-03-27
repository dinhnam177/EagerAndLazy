package com.example.cart_.service;

import com.example.cart_.domain.Cart;
import com.example.cart_.domain.CartDetails;
import com.example.cart_.reponsitory.ICartDetailReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDetailsService implements ICartDetailsService{

    @Autowired
    ICartDetailReponsitory iCartDetailReponsitory;

    @Override
    public List<CartDetails> finAll() {
        return iCartDetailReponsitory.findAll();
    }

    @Override
    public void saveAll(List<CartDetails> cartDetails) {
        iCartDetailReponsitory.saveAll(cartDetails);
    }

    @Override
    public void deleteCart( CartDetails cartDetails) {
        iCartDetailReponsitory.delete(cartDetails);
    }
}
