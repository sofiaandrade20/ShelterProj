package com.example.backendshelter.model;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Shelter {
    @Id
    private Long id;

    @OneToMany(mappedBy = "shelter", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Pet> petList;

    @Enumerated
    private ShelterCity shelterCity;
    private String shelterName;
    private Long maxCapacity;
}
