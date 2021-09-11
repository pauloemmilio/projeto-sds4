package com.pauloemmilio.dsvendas.controllers;

import com.pauloemmilio.dsvendas.dtos.SaleDTO;
import com.pauloemmilio.dsvendas.dtos.SellerDTO;
import com.pauloemmilio.dsvendas.services.SaleService;
import com.pauloemmilio.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> sellers = service.findAll(pageable);
        return ResponseEntity.ok(sellers);
    }
}
