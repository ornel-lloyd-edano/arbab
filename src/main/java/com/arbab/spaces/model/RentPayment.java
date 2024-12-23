package com.arbab.spaces.model;

import java.time.ZonedDateTime;
import java.util.Optional;

public record RentPayment(int id, int amount, PaymentType paymentType, ZonedDateTime paidAt, Optional<String> referenceNumberIfNonCash) {}

