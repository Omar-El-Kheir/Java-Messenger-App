package oop_project;

public class PlayerHandler {

    boolean turn;
    final int easy = 1;
    final int medium = 2;
    final int hard = 3;

    int difficulty;

    PlayerHandler() {
        this.turn = true;
        this.difficulty = easy;
    }

    public boolean getTurn() {
        return turn;
    }

    public void setTurn(boolean value) {
        this.turn = value;
    }

    public boolean endTurn() {
        return this.turn = !this.turn;
    }

}

