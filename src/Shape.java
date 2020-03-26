public class Shape {
    private String color="red";
    private boolean filled = false;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

//    public boolean getFilled() {
//        return filled;
//    }

    @Override
    public String toString() {
        return "Color: "
                + color
                + ", Filled: "
                + (isFilled() ? "yes" : "not filled");
    }
}
