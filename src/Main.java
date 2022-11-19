public class Main {
    public static void main(String[] args) {

        // balans - Текущий баланс клиента.
        // reple - Сумма на которую клиент пополняет счет
        // bonus - бонус который получает клиент.
        // itog - итоговый счет клиента.

        int balans = 100;
        int reple = 11000;
        int bonus;
        int itog;
        if (reple >= 1100) {
            bonus = reple / 100;
            itog = balans + reple + bonus;
        }
        else {
            bonus = 0;
            itog = balans + reple;
        }

        System.out.println("Вы пополнили счет на " + reple);
        System.out.println("Вы получили " + bonus + " бонусных рублей.");
        System.out.println("Текущий баланс: " + itog);
    }
}