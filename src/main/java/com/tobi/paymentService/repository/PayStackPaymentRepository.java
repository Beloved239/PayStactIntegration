package com.tobi.paymentService.repository;


import com.tobi.paymentService.entity.PaymentPayStack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayStackPaymentRepository extends JpaRepository<PaymentPayStack, Long> {
}

