package ua.pp.voronin.serhii.tommy.model;
import ua.pp.voronin.serhii.tommy.model.packaging.Box;

public class CalculateBoxPrice {

    protected int calculateBoxPrice(Box box, int pricePerMeter) {

        int boxSize = box.getSide();
        int boxArea = 6 * boxSize * boxSize ; // площа поверхні куба в мм²
        double pricePerMilimeter = pricePerMeter / 1000d / 1000d;
        return (int) Math.ceil(boxArea * pricePerMilimeter);
    } // Підказка: чи має цей класс займатися вирахуванням вартості ящику?(Ні,можна ввести ще один класу для обчислення ціни,нагромадження класів при цьому відсутнє)
}
