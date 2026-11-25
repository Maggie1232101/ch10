import java.util.Random;
import java.util.Scanner;

public class FractionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println(
            "Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

        int questions = 0;
        int correct = 0;
        String str = "";
        while (!str.equals("quit")) {
            Fraction f1 = new Fraction(random.nextInt(9)+1, random.nextInt(9) + 1);
            Fraction f2 = new Fraction(random.nextInt(9)+1, random.nextInt(9) + 1);
            int operation = random.nextInt(4);

            Fraction ans = new Fraction();
            if (operation == 1) {
                ans = Fraction.add(f1, f2);
            } else if (operation == 2) {
                ans = Fraction.subtract(f1, f2);
            } else if (operation == 3) {
                ans = Fraction.mult(f1, f2);

            } else {
                ans = Fraction.divide(f1, f2);
            }

            //System.out.print(ans);
            str = in.nextLine();

            if (!str.equals("quit")) {
				questions++;
                if (str.equals(ans.toString())) {
                    System.out.println("Correct!");
                    correct ++;
                } else {
                    System.out.println("Wrong: ans is " + ans.toString());
                }
            }
        }
        Fraction done = new Fraction(correct,questions);
        System.out.println("You got: " + done + " " + done.toDouble()*100 + "%");
    }
}
