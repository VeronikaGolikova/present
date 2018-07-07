package present;

public class Marshmallow extends Present {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Marshmallow(String name, Double weigh, Double price, String color) {
        super(name, weigh, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Зефир = [" + super.toString() + ", цвет зефира - " + color + "]";
    }
}
