import java.util.Scanner;

public class sameornot { public static void main(String[] args) {
    System.out.println("enter a first number");
    Scanner sc =new Scanner(System.in);
    int num1= sc.nextInt();
    System.out.println("enter a first number");
    int num2= sc.nextInt();
    if(num1==num2)
        System.out.println("THE NUMBERS SAME");
    else
        System.out.println("the numbers are different");
}
}

