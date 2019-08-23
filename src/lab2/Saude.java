package lab2;

public class Saude {

	private String saudeMental;
	private String saudeFisica;

	public Saude() {
		saudeMental = "boa";
		saudeFisica = "boa";
	}

	void defineSaudeMental(String valor) {
		saudeMental = valor;
	}

	void defineSaudeFisica(String valor) {
		saudeFisica = valor;
	}

	public String getStatusGeral() {
		if (saudeMental.equals("boa") && saudeFisica.equals("boa")) {
			return "boa";

		} else if (saudeMental.equals("fraca") && saudeFisica.equals("fraca")) {
			return "fraca";

		} else {
			return "ok";
		}
	}
}