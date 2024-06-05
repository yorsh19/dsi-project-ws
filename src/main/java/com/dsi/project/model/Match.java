package com.dsi.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Area area;
    
    @ManyToOne
    private Competition competition;
    
    @ManyToOne
    private Team homeTeam;
    
    @ManyToOne
    private Team awayTeam;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date utcDate;
    
    private String status;
    private int minute;
    private int injuryTime;
    private Integer attendance;
    private String venue;
    private int matchday;
    private String stage;
    private String matchGroup;
    private String lastUpdated;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Goal> goals;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Player> lineup;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Player> bench;
}
