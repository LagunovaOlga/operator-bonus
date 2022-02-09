public class Main {
    public static void main(String[] args) {
        int startingScore = 50;
        int replenishmentAmount = 1001;

        int percent;
        int finalScore;
        if (replenishmentAmount > 1000) {
            percent = replenishmentAmount / 100;
            finalScore = startingScore + replenishmentAmount + percent;
        } else {
            percent = 0;
            finalScore = startingScore + replenishmentAmount;
        }
        System.out.println("Сумма на вашем счету " + finalScore);
        System.out.println("Ваш бонус равен " + percent);
    }
}
