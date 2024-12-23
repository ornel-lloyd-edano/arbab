package com.arbab.spaces.model;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

public record ContractDetails(int id, RentableSpace space, User tenant, RentalRate totalPrice,
                              DurationStay durationStay, List<RentPayable> rentPayable, ZonedDateTime payableAt,
                              Optional<AdvancePayment> maybeAdvance, Optional<DepositPayment> maybeDeposit) {
}

