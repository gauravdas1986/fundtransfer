package com.fundtransfer.grainite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fundtransfer.grainite.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByIdentificationNumber(String identificationNumber);
}
