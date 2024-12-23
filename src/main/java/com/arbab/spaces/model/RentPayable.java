package com.arbab.spaces.model;

import java.time.ZonedDateTime;
import java.util.Optional;

public record RentPayable(int id, ContractDetails contract, int amount, ZonedDateTime dueDate, Optional<RentPayment> payment) {}

