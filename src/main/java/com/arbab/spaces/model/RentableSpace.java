package com.arbab.spaces.model;

import java.util.List;

public record RentableSpace(int id, String name, String location, SpaceType type,
                            RentalRate minRate, RentalRate maxRate, List<Amenity> amenities) {}

