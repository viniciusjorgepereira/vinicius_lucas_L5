package hotel;

import java.util.ArrayList;

public class Recepcao {

	private ArrayList <Estadia> estadias;
	private final String pulaLinha = System.lineSeparator();
	
	public Recepcao(){
		estadias = new ArrayList<>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor){
		estadias.add(new Estadia(nome, tipo, idade, dias, valor));
	}
	
	public void checkOut(String nome){
		for (int i = 0; i < estadias.size(); i++){
			if (estadias.get(i).getNome().equals(nome)){
				Estadia remover = (Estadia) estadias.get(i);
				estadias.remove(remover);
			}
		}
	}

	public int getNumDeHospedes() {
		return estadias.size();
	}

	public double getLucroTotal() {
		double acumulador = 0;
		for (int i = 0; i < estadias.size(); i++){
			acumulador += estadias.get(i).getValor();
		}
		return acumulador;
	}

	public String toString(){
		String saida = "";
		for (int i = 0; i < estadias.size(); i++){
			saida += estadias.get(i).toString() + pulaLinha;
		}
		return saida;
	}
}
