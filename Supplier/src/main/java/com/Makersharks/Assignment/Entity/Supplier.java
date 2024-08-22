package com.Makersharks.Assignment.Entity;

import com.Makersharks.Assignment.Enum.ManufacturingProcess;
import com.Makersharks.Assignment.Enum.Natureofbusiness;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Supplier")
public class Supplier {

    @Id
    @Column(name = "supplier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long supplier_id;

    @Column(name="company_name",nullable = false)
    String company_name;

    @Column(name="website",nullable = false)
    String website;

    @Column(name="location",nullable = false)
    String location;

    @Column(name="nature_of_business",nullable = false)
    @Enumerated(EnumType.STRING)
    private Natureofbusiness natureofbusiness;

    @Column(name="manufacturing_processes",nullable = false)
    @Enumerated(EnumType.STRING)
    private ManufacturingProcess manufacturingProcess;
}
