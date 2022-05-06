package padroes.oberver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversarianteObservador> oberservadores = new ArrayList<>();

	public void registrarObservador(ObservadorChegadaAniversarianteObservador observador) {
		oberservadores.add(observador);
	}
	
	public void mnitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversáriante chegou?");
			valor = entrada.nextLine();
			if("sim".equalsIgnoreCase(valor)) {
				//Criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				//notificar os observadores!
				oberservadores.stream().forEach(o -> o.chegou(evento));
			} else {
				System.out.println("Alarme falso!");
			}
		}
		
		entrada.close();
	}
}
