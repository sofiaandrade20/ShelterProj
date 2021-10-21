package com.example.backendshelter.controller.request;

import com.example.backendshelter.model.ShelterCity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateShelterRQ {
    private String shelterCity;
    private String shelterName;
    private Long maxCapacity;
}
