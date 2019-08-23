package lab2;

import java.util.Arrays;

public class Disciplina {

	private String nomeDisciplina;
	private int cargaHoraria;
	private double[] notas;

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		notas = new double[4];

	}

	public void cadastraHoras(int horas) {
		cargaHoraria += horas;

	}

	public void cadastraNota(int nota, double valorNota) {
		notas[nota - 1] = valorNota;
	}

	private double media() {
		double notaTotal = 0;
		for (int i = 0; i < notas.length; i++) {
			notaTotal += notas[i];
		}

		return notaTotal / notas.length;

	}

	public boolean aprovado() {
		if (media() >= 7) {
			return true;

		} else {
			return false;
		}

	}

	public String toString() {
		return (nomeDisciplina + " " + cargaHoraria + " " + media() + " " + Arrays.toString(notas));
	}
}
