package com.example.bootquickstart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="JPlayer")

public class Player {
    @Id
    private long playerId;
    @Length(max=10, min=3, message = "Player Name should be minimum 3 chars and maximum 10 chars long.")
    private String playerName;
    private double iccRanking;
}
