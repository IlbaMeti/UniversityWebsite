package com.example.beder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bachelor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bachelor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isComputerScience;
    private boolean isTIK;
    private boolean isLaw;
    private boolean isCommMultimedia;
    private boolean isIslamicScience;
}
