package core.basesyntax.model;

public abstract class Figure implements Drawable {
    private String color;
    private String figureName;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
}
