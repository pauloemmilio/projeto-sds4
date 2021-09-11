package com.pauloemmilio.dsvendas.services;

import com.pauloemmilio.dsvendas.dtos.SaleDTO;
import com.pauloemmilio.dsvendas.entities.Sale;
import com.pauloemmilio.dsvendas.repositories.SaleRepository;
import com.pauloemmilio.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> sellers = repository.findAll(pageable);
        return sellers.map(SaleDTO::new);
    }
}
