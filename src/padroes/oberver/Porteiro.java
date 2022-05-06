package padroes.oberver;

import java.util.ArrayList;
import java.util.List;

public class Porteiro {

	private List<ObservadorChegadaAniversarianteObservador> oberservadores = new ArrayList<>();

	public void registrarObservador(ObservadorChegadaAniversarianteObservador observador) {
		oberservadores.add(observador);
	}
}
