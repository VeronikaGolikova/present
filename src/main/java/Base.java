import present.Chocolate;
import present.Jellybean;
import present.Marshmallow;
import present.Present;

public class Base {
    public static  void main(String[] args) {

        Chocolate chocolateLindt = new Chocolate("Lindt", 200.00, 150.00, "75%");
        Chocolate chocolateBabaevskiy = new Chocolate("Бабаевский с фундуком", 100.00, 85.00, "45%");
        Jellybean jellybeanWorms = new Jellybean("Червячки", 50.50, 69.90, "Червячки");
        Marshmallow marshmallow = new Marshmallow("Бобруйский с клюквой", 90.00, 149.90, "Розовый");
        Marshmallow marshmallow2 = new Marshmallow("Шармель в шоколаде", 250.00, 450.60, "Белый в шоколаде");
        Present[] present = {chocolateLindt, chocolateBabaevskiy, jellybeanWorms, marshmallow, marshmallow2};

        Double sumPrice = new Double(0.00);
        Double sumWeigh = new Double(0.00);

        for (int i = 0; i < present.length ; i++){
            sumPrice = sumPrice + present[i].getPrice();
        }

        System.out.println("Цена подарка = " + sumPrice);

        for (int i = 0; i < present.length ; i++){
            sumWeigh = sumWeigh + present[i].getWeigh();
        }

        System.out.println("Вес подарка = " + sumWeigh + "\n" + "Состав подарка:");

        for (Present somePresent : present) {
            System.out.println(somePresent.toString());
        }
    }
}
