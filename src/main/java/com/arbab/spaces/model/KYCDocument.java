package com.arbab.spaces.model;

import java.time.ZonedDateTime;

public record KYCDocument(int id, KYCType type, String documentIdNumber, ZonedDateTime validUntil, String mediaLink) {}

