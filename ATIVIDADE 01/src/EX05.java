public class EX05 {
    public static void main(String[] args){

        for (long i = 0; i <= 30; i++){
            for (long n = 1, fatorial = 1; n <= i; n++){
                fatorial *= n;
                System.out.println("O Fatorial do número " + i +  " é : "  + fatorial);
            }
        }
    }
    // Provavelmente o tipo int não atendia ao tamanho de dados necessário para o resultado do algoritmo.
    // O tipo de dados long tem maior intervalo e largura em comparação com o tipo o int.
}
