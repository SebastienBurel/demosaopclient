package client;

public class MonCodeClient {

	public static void main(String[] args) {
		
		//1. Instanciation du service (généré par wsimport)
		HelloObjisWSService monService = new HelloObjisWSService();
		
		//2. Récupération du client (généré par wsimport)
		HelloObjis port = monService.getHelloObjisWSPort();
		
		//3. Appel d'une opération du service
		String resultat = port.ditBonjour("Objis");
		
		System.out.println(resultat);
	}

}
