package agh.ics.oop.model;

public class IncorrectPositionException extends Exception {
    public IncorrectPositionException(Vector2d position) {
        super("Position (" + position.getX() + ", " + position.getY() + ") is not correct");
    }
}