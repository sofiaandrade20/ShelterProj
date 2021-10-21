package com.example.backendshelter.controller.request;

import com.example.backendshelter.model.Brand;
import lombok.*;

import javax.validation.constraints.Size;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateFoodRequest {
    private Brand brand;
    @Size(max = 255, message = "Description is too large")
    private String description;
}
