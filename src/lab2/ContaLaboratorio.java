package lab2;

public class ContaLaboratorio {

	private String nomeLaboratorio;
	private int cota;
	private int espacoUsado;

	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}

	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}

	public void consomeEspaco(int mbytes) {
		espacoUsado += mbytes;

	}

	public void liberaEspaco(int mbytes) {
		espacoUsado -= mbytes;

	}

	public boolean atingiuCota() {
		if (espacoUsado >= cota) {
			return true;

		} else {
			return false;
		}
	}

	public String toString() {
		return (nomeLaboratorio + " " + espacoUsado + "/" + cota);
	}
}
