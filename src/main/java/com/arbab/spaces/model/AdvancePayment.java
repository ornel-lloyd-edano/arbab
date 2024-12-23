package com.arbab.spaces.model;

import java.time.ZonedDateTime;

public record AdvancePayment(int id, ZonedDateTime paidFrom, ZonedDateTime paidUntil, RentPayment advanceRent) {}

