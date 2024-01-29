package com.example.beder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isComputerScience;
    private boolean isCommunicationScience;
    private boolean isIslamicScience;
    private boolean isReligiousScience;
}
