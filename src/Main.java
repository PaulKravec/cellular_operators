public class Main {
    public static void main(String[] args) {
        int startingScore = 100; // Начальный счёт
        int replenishmentAmount = 1100; // Cумма пополнения
        int secondReplenishmentAmount = 100; // Вторая сумма пополнения
        if (replenishmentAmount >= 1000) {
            System.out.println(replenishmentAmount + startingScore + (replenishmentAmount / startingScore));
        } else {
            System.out.println(startingScore + secondReplenishmentAmount);
        }


    }
}
