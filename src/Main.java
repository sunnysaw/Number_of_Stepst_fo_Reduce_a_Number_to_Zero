import java.util.Scanner;

public class Main {
    public static int numberOfSteps(int num) {
        // Your code goes here
        int count = 0;
        int Scount = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
                count++;
            }else{
                num -= 1;
                Scount++;
            }
        }
        return count + Scount;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(numberOfSteps(num));
    }
}