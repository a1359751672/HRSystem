package com.example.HRSystem.entity;

public class Mscore {
    private Integer id;
    private Integer mid;
    private Integer score;
    private String evaluate;

    public Mscore() {
    }

    public Mscore(Integer id, Integer mid, Integer score, String evaluate) {
        this.id = id;
        this.mid = mid;
        this.score = score;
        this.evaluate = evaluate;
    }

    @Override
    public String toString() {
        return "Mscore{" +
                "id=" + id +
                ", mid=" + mid +
                ", score=" + score +
                ", evaluate='" + evaluate + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }
}
