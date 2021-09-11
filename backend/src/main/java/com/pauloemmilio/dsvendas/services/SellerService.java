package com.pauloemmilio.dsvendas.services;

import com.pauloemmilio.dsvendas.dtos.SellerDTO;
import com.pauloemmilio.dsvendas.entities.Seller;
import com.pauloemmilio.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> sellers = repository.findAll();
        return sellers.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
