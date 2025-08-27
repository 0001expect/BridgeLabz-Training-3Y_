package programming_elements;
import java.util.*;

public class divisibility_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int rem = a%10;
        if(rem == 0 || rem == 5){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
