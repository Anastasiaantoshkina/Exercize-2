//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum = 10000;
        int replenishment = 100;
        int cash = sum + replenishment;

        int bonus = cash / 100;

        if (cash >= 1000) {

            System.out.println(bonus);

        } else {
            System.out.println(cash);
        }
    }
}
