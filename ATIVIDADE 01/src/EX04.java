public class EX04 {
    public static void main(String[] args){

        for (int i = 0; i <= 10; i++){
            for (int n = 1, fatorial = 1; n <= i; n++){
                fatorial *= n;
                System.out.println("O Fatorial do número " + i +  " é : "  + fatorial);
            }
        }
    }
}
    

