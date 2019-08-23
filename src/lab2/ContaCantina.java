package lab2;

public class ContaCantina {

	private String nomeDaCantina;
	private int gastos = 0;
	private int divida = 0;
	private int quantidadeDeLanches;

	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;

	}

	public void cadastraLanche(int quantidadeDeLanches, int valorLanche) {
		divida += valorLanche;
		gastos += valorLanche;
		this.quantidadeDeLanches += quantidadeDeLanches;
	}

	public void pagaConta(int pagamento) {
		divida -= pagamento;

	}

	public int getFaltaPagar() {
		return divida;
	}

	public String toString() {
		return (nomeDaCantina + " " + quantidadeDeLanches + " " + gastos);
	}
}