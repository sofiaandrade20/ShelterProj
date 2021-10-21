package com.example.backendshelter.controller.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePetNameRequest {
    private String name;
}
