package com.example.cart_.reponsitory;

import com.example.cart_.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReponsitory extends JpaRepository<Product, Integer> {
}
