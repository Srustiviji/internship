import java.util.Scanner;

public class positiveornegative { public static void main(String[] args) {
    System.out.println("ENTER A NUMBER");
    Scanner sc=new Scanner(System.in);
    int num1= sc.nextInt();
    if (num1<0)
        System.out.println("ITS A NEGATIVE NUMBER");
    else if(num1==0)
        System.out.println("the number is zero");
    else
        System.out.println("the number is positive");

}


}

