package com.SRFoods.Online.Food.Ordering.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

public class ContactInformation {
    private String email;
    private String mobile;
    private String twitter;
    private String instagram;
}
