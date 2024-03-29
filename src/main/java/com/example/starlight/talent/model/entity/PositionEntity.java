package com.example.starlight.talent.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Builder
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PositionEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long positionId;

    String position;
    @ManyToMany(mappedBy = "positions", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference
    Set<TalentEntity> talents;
}
