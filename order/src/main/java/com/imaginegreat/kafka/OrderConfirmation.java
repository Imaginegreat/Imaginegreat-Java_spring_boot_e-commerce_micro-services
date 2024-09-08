package com.imaginegreat.kafka;

import com.imaginegreat.customer.CustomerResponse;
import com.imaginegreat.order.PaymentMethod;
import com.imaginegreat.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
