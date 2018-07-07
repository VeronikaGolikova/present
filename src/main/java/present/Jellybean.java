package present;

public class Jellybean extends Present {

    private String formOfJelly;

    public String getFormOfJelly() {
        return formOfJelly;
    }

    public void setFormOfJelly(String formOfJelly) {
        this.formOfJelly = formOfJelly;
    }

    public Jellybean(String name, Double weigh, Double price, String formOfJelly) {
        super(name, weigh, price);
        this.formOfJelly = formOfJelly;
    }

    @Override
    public String toString() {
        return "Мармеладки = [" + super.toString() + ", форма желешек - " + formOfJelly + "]";
    }
}
