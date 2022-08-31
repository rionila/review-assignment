package com.cycleon.orderservice.shipment.repository;

import com.cycleon.orderservice.shipment.model.Shipment;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShipmentRepository {

    List<Shipment> findAll();
    Optional<Shipment> findById(int id);
}
