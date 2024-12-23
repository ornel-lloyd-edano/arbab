package com.arbab.spaces.model;

import java.time.ZonedDateTime;
import java.util.Optional;

public record Deposit(RentPayment payment, int minDaysReturnAfterMoveOut, Optional<ZonedDateTime> returnedAt) {}