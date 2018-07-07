package present;

public class Chocolate extends Present {

    private String cacaoPercent;

    public String getCacaoPercent() {
        return cacaoPercent;
    }

    public void setCacaoPercent(String cacaoPercent) {
        this.cacaoPercent = cacaoPercent;
    }

    public Chocolate(String name, Double weigh, Double price, String cacaoPercent) {
        super(name, weigh, price);
        this.cacaoPercent = cacaoPercent;
    }

    @Override
    public String toString() {
        return "Шоколад = [" + super.toString() + ", процент содержания какао - " + cacaoPercent + "]";
    }
}
