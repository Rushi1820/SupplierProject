package com.Makersharks.Assignment.Repository;

import com.Makersharks.Assignment.Entity.Supplier;
import com.Makersharks.Assignment.Enum.ManufacturingProcess;
import com.Makersharks.Assignment.Enum.Natureofbusiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
    @Query("SELECT s FROM Supplier s " +
            "WHERE s.location = :location " +
            "AND s.natureofbusiness = :natureofbusiness " +
            "AND s.manufacturingProcess = :manufacturingProcess")
    List<Supplier> findByLocationAndnatureofbusinessAndmanufacturingProcessContains(
            String location,
            Natureofbusiness natureofbusiness,
            ManufacturingProcess manufacturingProcess
    );

    Optional<Supplier> findByLocation(String location);
}
