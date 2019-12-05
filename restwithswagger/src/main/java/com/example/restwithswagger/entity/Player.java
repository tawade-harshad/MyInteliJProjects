package com.example.restwithswagger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="JPlayer")

public class Player {
    @Id
    private long playerId;
    @Length(min=3, max=10, message = "Player name should be minimum 3 chars and maximum 10 chars")
    private String playerName;

    @DecimalMax("5.0")
    @DecimalMin("1.0")
    private double iccRanking;
}
