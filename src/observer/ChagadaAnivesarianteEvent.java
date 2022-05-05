package observer;

import java.util.Date;

public class ChagadaAnivesarianteEvent {

	private final Date horaDaChegada;

	public ChagadaAnivesarianteEvent(Date horaDaChegada) {
		super();
		this.horaDaChegada = horaDaChegada;
	}

	public Date getHoraDaChegada() {
		return horaDaChegada;
	}

}
