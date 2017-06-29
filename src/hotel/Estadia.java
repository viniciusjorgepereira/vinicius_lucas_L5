package hotel;

public class Estadia {
	
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.valor = valor;
		this.dias = dias;
		this.animal = new Animal(nome, tipo, idade);
	}


	public double getValor() {
		return valor;
	}


	public int getDias() {
		return dias;
	}

	public String getNome() {
		return animal.getNome();
	}

	public String getTipo() {
		return animal.getTipo();
	}

	public int getIdade() {
		return animal.getIdade();
	}	
		
	public String toString() {
		return  animal.getNome() + " (" + animal.getTipo() + "): " + dias + " dias com o preço de R$ " + valor;
	}
}
