import java.util.Scanner;

public class oddoreven { public static  void main(String[] args) {
    System.out.println("enter a number:)");
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    if(num%2==0)
        System.out.println("even number");
    else
        System.out.println("its a odd number");
}

}

