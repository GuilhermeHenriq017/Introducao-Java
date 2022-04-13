import java.util.Scanner;

public class EX07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = input.nextInt();

        int y = 0;

        while(x != 1){

            if(x % 2 == 0){
                y = x / 2;
                x = y;
            }else{
                y = 3 * x + 1;
                x = y;
            }
            System.out.print("-> "+x);
        }
    }
    
}
