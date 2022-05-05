package observer;

public class Anivers�rioSupresa {

	public static void main(String[] args) {

		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();

		porteiro.addChagadaAbiversarianteObserver(namorada);
		
		porteiro.start();
		
	}
}
