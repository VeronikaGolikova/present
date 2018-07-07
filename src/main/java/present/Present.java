package present;

public class Present {
    private String name;
    private Double weigh, price;
    private String batch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeigh() {
        return weigh;
    }

    public void setWeigh(Double weigh) {
        this.weigh = weigh;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Present(String name, Double weigh, Double price) {
        this.name = name;
        this.weigh = weigh;
        this.price = price;
    }

    @Override
    public String toString() {
        return "название - " + name + ", вес = " + weigh + ", цена = " + price;
    }
}
