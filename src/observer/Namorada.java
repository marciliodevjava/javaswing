package observer;

public class Namorada implements ChagadaAbiversarianteObserver {

	@Override
	public void chegou(ChagadaAbiversarianteObserver event) {
		System.out.println("Apagar as luzes...");
		System.out.println("Fazer sil�ncio...");
		System.out.println("Surpresa!!!");
	}

}
