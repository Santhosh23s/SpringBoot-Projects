package com.codeWithSan.San.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeWithSan.San.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
