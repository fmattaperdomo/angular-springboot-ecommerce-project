package com.fmattaperdomo.ecommerce_fmp.dao;

import com.fmattaperdomo.ecommerce_fmp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
