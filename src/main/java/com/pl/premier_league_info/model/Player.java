package com.pl.premier_league_info.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {

    @Id
    @Column(name="player_name", unique = true)
    private String name;
    private String nation;
    private String position;
    private Integer age;
    @Column(name="matches_played")
    private Integer mp;
    private Integer starts;
    @Column(name="minutes_played")
    private Double min;
    private Double goals;
    private Double assists;
    @Column(name="penalties_scored")
    private Double pk;
    @Column(name="yellow_cards")
    private Double crdy;
    @Column(name="red_cards")
    private Double crdr;
    @Column(name="expected_goals")
    private Double xg;
    @Column(name="expected_assists")
    private Double xag;
    @Column(name="team_name")
    private String team;

    public Player() {}

    public Player(String name, String nation, String position, Integer age, Integer mp, Integer starts, Double min, Double goals, Double assists, Double pk, Double crdy, Double crdr, Double xg, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.goals = goals;
        this.assists = assists;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public Double getCrdy() {
        return crdy;
    }

    public void setCrdy(Double crdy) {
        this.crdy = crdy;
    }

    public Double getCrdr() {
        return crdr;
    }

    public void setCrdr(Double crdr) {
        this.crdr = crdr;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
