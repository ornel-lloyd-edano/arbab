package com.arbab.spaces.model;

import java.util.List;

public record User(int id, String firstName, String lastName, String primaryEmail,
                   String primaryContactNumber, String username, String password,
                   List<KYCDocument> kycDocsProvided) {}

