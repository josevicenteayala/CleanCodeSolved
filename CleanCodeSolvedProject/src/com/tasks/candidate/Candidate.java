package com.tasks.candidate;

public final class Candidate implements Comparable<Candidate> {
    private int score;
    private String name;

    public Candidate(int score, String name){
        this.score = score;
        this.name = name;
    }

    public int getScore(){
        return score;
    }

    public String getName(){
        return name;
    }

    public void setScore(int score) {
        this.score += score;
    }

    @Override
    public int compareTo(Candidate candidate) {
        return candidate.getScore() - this.score;
    }

    @Override
    public String toString() {
        return "The score is " + this.score + ", the name is " + this.name;
    }
}
