package task3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        // Заданное количество и цена
        BigDecimal setchenkoQuantity = new BigDecimal("1.88848888");
        BigDecimal setchenkoPrice = new BigDecimal("10.50");

        BigDecimal kozlovQuantity = new BigDecimal("1.88848888");
        BigDecimal kozlovPrice = new BigDecimal("10.50");

        // Вычисление значений для Сетченко
        BigDecimal setchenkoValue = calculateValue(setchenkoQuantity, setchenkoPrice);
        BigDecimal setchenkoSum = calculateSum(setchenkoQuantity, setchenkoPrice);
        BigDecimal setchenkoDistribution = calculateDistribution(setchenkoValue, setchenkoSum);

        // Вычисление значений для Козлова
        BigDecimal kozlovValue = calculateValue(kozlovQuantity, kozlovPrice);
        BigDecimal kozlovSum = calculateSum(kozlovQuantity, kozlovPrice);
        BigDecimal kozlovDistribution = calculateDistribution(kozlovValue, kozlovSum);

        // Вывод результатов
        System.out.println("Значения для Сетченко:");
        System.out.println("Округленное Количество*Цена: " + setchenkoValue);
        System.out.println("Сумма: " + setchenkoSum);
        System.out.println("Распределение копеек: " + setchenkoDistribution);

        System.out.println("Значения для Козлова:");
        System.out.println("Округленное Количество*Цена: " + kozlovValue);
        System.out.println("Сумма: " + kozlovSum);
        System.out.println("Распределение копеек: " + kozlovDistribution);
    }


    // Вычисление значения колонки "Округленное Количество*Цена"
    public static BigDecimal calculateValue(BigDecimal quantity, BigDecimal price) {
        return quantity.multiply(price).setScale(2, RoundingMode.HALF_UP);
    }

    // Вычисление значения колонки "Сумма"
    public static BigDecimal calculateSum(BigDecimal quantity, BigDecimal price) {
        return quantity.multiply(price).setScale(2, RoundingMode.HALF_UP);
    }

    // Вычисление значения колонки "Распределение копеек"
    public static BigDecimal calculateDistribution(BigDecimal value, BigDecimal sum) {
        return value.subtract(sum);
    }

}
// Использовал BigDecimal для удобства округления. Можно и без него
/*
Например вычисление общее количество и суммы

double totalQuantity = 0;
    double totalPrice = 0;
    for (Item item : items) {
        totalQuantity += item.getQuantity();
        totalPrice += item.getTotal();
    }

    Где Item класс представленной товарной позиции

     Вычисление детализации для каждой позиции

    for (Item item : items) {
        ItemDetail detail = new ItemDetail();
        detail.setName(item.getName());
        detail.setQuantity(item.getQuantity());

    Вычисление округленной суммы
        double roundedTotal = Math.round(item.getTotal() * 100) / 100.0;
        detail.setRoundedTotal(roundedTotal);

     Вычисление распределения копеек
        double centsDistribution = Math.round((roundedTotal - item.getTotal()) * 100) / 100.0;
        detail.setCentsDistribution(centsDistribution);

    Вычисление суммы
        double proportion = item.getQuantity() / totalQuantity;
        double total = Math.round((totalPrice * proportion + centsDistribution) * 100) / 100.0;
        detail.setTotal(total);

        details.add(detail);
    Формула для вычисления колонки «Распределение копеек» для Иванова, Петрова, Сидорова:
        double centsDistribution = Math.round((roundedTotal - item.getTotal()) * 100) / 100.0;

        Формула для вычисления колонки Сумма:
        double total = Math.round((totalPrice * proportion + centsDistribution) * 100) / 100.0;
 */