public class EX06 {
    public static void main(String[] args){

        int[] vet = new int[20];

        for(int f = 1; f <= 10; f++){
            System.out.println(f);

            if(f < 2 ){
                System.out.println(1+2);
            }else
            {
                f = (f - 1) + (f - 2);
                System.out.println( f );
            }
        }
    }
}
