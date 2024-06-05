package com.dsi.project.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int minute;
    private Integer injuryTime;
    private String type;

    @ManyToOne
    private Team team;

    @ManyToOne
    private Player scorer;
    
    private String assist;
    private int homeScore;
    private int awayScore;

}
