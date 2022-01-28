import java.util.Scanner;

public class test {public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("enter the num");
    int b =myObj.nextInt();

    String[] nums = new String[b+1];
    for(int i = 0; i < nums.length; i++){
        String c=myObj.nextLine();
        String cd=c.toUpperCase();
        nums[i] = cd;

    }
    int n=nums.length;
    for(int j=0;j<n;j++){
        System.out.println(nums[j]);
    }

}
}


