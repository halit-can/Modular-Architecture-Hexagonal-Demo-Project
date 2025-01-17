package com.hexagonaldemo.paymentapi.payment.port;

import com.hexagonaldemo.paymentapi.payment.command.PaymentCreate;
import com.hexagonaldemo.paymentapi.payment.command.PaymentRollback;
import com.hexagonaldemo.paymentapi.payment.model.Payment;

public interface PaymentPort {

    Payment create(PaymentCreate paymentCreate);

    Payment retrieve(Long accountId);

    void rollback(PaymentRollback paymentRollback);
}
