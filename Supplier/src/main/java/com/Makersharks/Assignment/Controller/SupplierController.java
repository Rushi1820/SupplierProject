package com.Makersharks.Assignment.Controller;

import com.Makersharks.Assignment.Entity.Supplier;
import com.Makersharks.Assignment.Service.SupplierService;
import com.Makersharks.Assignment.Enum.Natureofbusiness;
import com.Makersharks.Assignment.Enum.ManufacturingProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/create")
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        try {
            return supplierService.saveSupplier(supplier);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
        }
    }

    @PostMapping("/query")
    public List<Supplier> querySuppliers(
            @RequestParam String location,
            @RequestParam Natureofbusiness natureofbusiness,
            @RequestParam ManufacturingProcess manufacturingProcess,
            @RequestParam int limit
    ) {
        return supplierService.findSuppliers(location, natureofbusiness, manufacturingProcess, limit);
    }
}
