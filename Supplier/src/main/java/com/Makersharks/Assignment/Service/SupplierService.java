package com.Makersharks.Assignment.Service;

import com.Makersharks.Assignment.Entity.Supplier;
import com.Makersharks.Assignment.Enum.ManufacturingProcess;
import com.Makersharks.Assignment.Enum.Natureofbusiness;
import com.Makersharks.Assignment.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier saveSupplier(Supplier supplier) {
        if (isLocationUnique(supplier.getLocation())) {
            return supplierRepository.save(supplier);
        } else {
            throw new IllegalArgumentException("Supplier with this location already exists.");
        }
    }

    public boolean isLocationUnique(String location) {
        return supplierRepository.findByLocation(location).isEmpty();
    }

    public List<Supplier> findSuppliers(String location, Natureofbusiness natureofbusiness, ManufacturingProcess manufacturingProcess, int limit) {
        return supplierRepository.findByLocationAndnatureofbusinessAndmanufacturingProcessContains(
                location, natureofbusiness, manufacturingProcess
        ).stream().limit(limit).toList();
    }




}
