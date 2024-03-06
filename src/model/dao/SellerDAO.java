package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDAO {

    void insert(Seller department);
    void update(Seller department);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
