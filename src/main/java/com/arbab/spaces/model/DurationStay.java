package com.arbab.spaces.model;

import java.time.ZonedDateTime;
import java.util.Optional;

public record DurationStay(ZonedDateTime stayFrom, Optional<ZonedDateTime> stayUntil) {}

