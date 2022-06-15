public class DVD extends Produto{

	private String duracao;
	
	public DVD(int cod_Barras) {
		super(cod_Barras);
	}
	
	public void dados (String nome, double preco, String duracao){
		super.dados(nome, preco);
		this.duracao = duracao;
	}

	//Sobrescrita do metodo toString
	public String toString(){
		return super.toString() + "\nDuração: " + this.duracao;	
	}
	
}