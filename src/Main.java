//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum = 100;
        int replenishment = 1000;
        int cash = sum + replenishment;
        int bonus = replenishment / 100 + sum + replenishment;

        if (replenishment > 1000) {
            System.out.println(bonus);

        } else {
            System.out.println(cash);
        }
    }
}
