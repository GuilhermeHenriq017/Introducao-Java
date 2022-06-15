import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loja {
	
	static int cod_Barras;
	
	public static void main(String[] args) {
		
		//Criação do Array de produtos
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		//Cadastro de produtos
		CD cd1 = new CD(2633301);
		cd1.dados("Master of Puppets", 23.00, 14);
		
		CD cd2 = new CD(0007432);
		cd2.dados("Fear of the Dark", 25.00, 17);

		DVD dvd1 = new DVD(885533700);
		dvd1.dados("Homem de Aço", 35.00, "2:46");

		DVD dvd2 = new DVD(100166650);
		dvd2.dados("O Poderoso Chefão", 56.00, "1:59");
	
		DVD dvd3 = new DVD(45774757);
		dvd3.dados("Gladiador", 29.90, "1:23");
		
		Livro livro1 = new Livro(2555258);
		livro1.dados("O Hobbit", 45.90, "J.R.R. Tolkien");

		Livro livro2 = new Livro(653343330);
		livro2.dados("Brave New World", 60.00, "Audous Huxley");
		
		//Inclusão dos produtos na Arraylist
		produtos.add(cd1);
		produtos.add(cd2);		
		produtos.add(dvd1);
		produtos.add(dvd2);
		produtos.add(dvd3);
		produtos.add(livro1);
		produtos.add(livro2);		
		
		for (Produto produto : produtos){
			System.out.println(produto.toString());
		}	
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("\nInforme o código de barras do produto: ");
			
			cod_Barras = entrada.nextInt();
		}
		Loja.LocalizaProd(produtos, cod_Barras);
		
		Collections.sort(produtos);
		for (Produto produto : produtos){
			System.out.println(produto);			
		}

		System.out.println("\n" + dvd1.equals(dvd2));
		System.out.println(dvd1.equals(dvd3));			
	}
	

	public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras)
	{
		for (Produto produto : produtos){
			if (produto.GetCod_Barras() == cod_Barras){
				System.out.println("-------------------------" + produto.toString() + 
				"\n-------------------------");
				return;
			}							
		}
		System.out.println("Produto não encontrado.");
	}

	

	
}