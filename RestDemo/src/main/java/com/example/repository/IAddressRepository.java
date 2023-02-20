package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {

}
