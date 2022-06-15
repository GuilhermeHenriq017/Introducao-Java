public class Produto implements Comparable<Produto> {
	    
	private static Double tipo = 0.0;
	private String nome;
	private double preco;
	private int cod_Barras;
	
	public Produto (int cod_Barras){
		this.cod_Barras = cod_Barras;
	}

	public static Double getTipo() {
		return tipo;
	}

	public Double getPreco() {
		return preco;
	}

	public void dados (String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString(){
		return "\nCodigo de Barra: " + this.cod_Barras
				+  "\nNome: " + this.nome +
				"\nPreco: " + this.preco;	
	}
	
	public int GetCod_Barras(){
		return this.cod_Barras;
	}

	public String getNome() {
		return nome;
	}

	@Override
    public int compareTo(Produto p) {
        if (getTipo().equals(0.0)){
            return comparePreco(p);
        }else{
            return compareNome(p);
        }
    }

	private int compareNome(Produto p){
        return this.getNome().compareTo(p.getNome());
    }
	
	@Override
	public boolean equals(Object obj) {
		Produto p = (Produto) obj;
		return this.GetCod_Barras() == p.GetCod_Barras();
	}

	private int comparePreco(Produto p){
        return this.getPreco().compareTo(p.getPreco());
    }

}