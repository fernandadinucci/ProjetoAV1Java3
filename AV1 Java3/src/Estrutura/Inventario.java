package Estrutura;

import java.util.ArrayList;

public class Inventario {
	
	//adicionarCarro(): Adiciona um carro ao invent�rio, recebendo os dados do usu�rio. 
	//adicionarMoto(): Adiciona uma moto ao invent�rio, recebendo os dados do usu�rio. 

	//array de object para poder adicionar tanto o objeto Carro quanto o objeto Motocicleta
	ArrayList<Object> ivt1= new ArrayList<Object>();
	
	public void adicionarCarro(Carro c) {
		if (ivt1.contains(c) == false){
			ivt1.add(c);
		}
		else
			System.out.println("Carro j� foi adicionado ao sistema");
	}
	
	public void adicionarMotocicleta(Motocicleta m) {
		if (ivt1.contains(m) == false) {
			ivt1.add(m);
		}
		else
			System.out.println("Motocicleta j� foi adicionado ao sistema");
	}
	
}
