package com.ianznudemy.api.repositories;

import com.ianznudemy.api.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdressRepository extends JpaRepository<Address, UUID> {
}
