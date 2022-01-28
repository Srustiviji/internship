import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String b = myObj.nextLine();

        String text = b.replaceAll("[^a-z]", "");

        String numberOnly = b.replaceAll("[^0-9]", "");

        int i = Integer.parseInt(numberOnly);

        int c = 2020 - i;

        System.out.println("Happy Birthday! " + text + " Your current age is " + c);

    }
}
