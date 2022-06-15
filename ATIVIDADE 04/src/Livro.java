public class Livro extends Produto {

	private String autor;
	
	public Livro(int cod_Barras) {
		super(cod_Barras);
	}

	public void dados (String nome, double preco, String autor){
		super.dados(nome, preco);
		this.autor = autor;
	}
	
	
	public String toString(){
		return super.toString() + "\nAutor: " + this.autor;	
	}
	
	
}