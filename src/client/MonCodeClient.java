package client;

public class MonCodeClient {

	public static void main(String[] args) {
		
		//1. Instanciation du service (g�n�r� par wsimport)
		HelloObjisWSService monService = new HelloObjisWSService();
		
		//2. R�cup�ration du client (g�n�r� par wsimport)
		HelloObjis port = monService.getHelloObjisWSPort();
		
		//3. Appel d'une op�ration du service
		String resultat = port.ditBonjour("Objis");
		
		System.out.println(resultat);
	}

}
