package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

	private List<ChagadaAbiversarianteObserver> observers = new ArrayList<ChagadaAbiversarianteObserver>();

	public void addChagadaAbiversarianteObserver(ChagadaAbiversarianteObserver observer){
		this.observers.add(observer);
	}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int valor = scanner.nextInt();
			if (valor == 1) {
				@SuppressWarnings("unused")
				ChagadaAnivesarianteEvent event = new ChagadaAnivesarianteEvent(new Date());
				// Notificar os observadores
				for(ChagadaAbiversarianteObserver observer: this.observers) {
					observer.chegou(observer);
					
				} 
			}else {
				System.out.println("Alarme Falso!");
			}
			
			scanner.close();
		}
		
	}
}
