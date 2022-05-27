package Exercicio;

public class Estatistica {
	private double [] valores;
	
	public Estatistica() {
	}
	
	public Estatistica(double[] valores) {
		this.valores = valores;
	}

	public double[] getValores() {
		return valores;
	}

	public void setValores(double[] valores) {
		this.valores = valores;
	}

	public void ordena(double [] valores) {
		double maior = 0.0;
		for (int i = 0; i < valores.length; i++) {
			for (int j = i+1; j < valores.length; j++) {
				if (valores[i] > valores[j]) {
					maior = valores[i];
					valores[i] = valores[j];
					valores[j] = maior;
				}
			}
		}
	}
	
	public double media(double [] valores) {
		double soma = 0.0;
		for (double n:valores) {
			soma += n;
		}
		return soma/valores.length;
	}
	
	public double moda(double [] valores) {
		double moda = 0.0;
		int qtde = 1;
		int compara = 0;
		for (int i = 0; i < valores.length; i++) {
			for (int j = i+1; j < valores.length; j++) {
				if (valores[i] == valores[j]) {
					qtde++;
				}
				if (qtde > compara) {
	                moda = valores[i];
	                compara = qtde;
	            }
			}
		}
		return moda;
	}
	
	public double mediana(double [] valores) {
		double mediana = 0.0;
		if (valores.length % 2 == 0) {
			mediana = valores[valores.length/2] + valores[(valores.length - 1)/2];
		}
		else {
			mediana = valores[(valores.length - 1)/2];
		}
		return mediana;
	}
		
	public double variancia(double [] valores) {
		double media = media(valores);
		double variancia = 0.0;
		double soma = 0;
		for (int i = 0; i < valores.length; i++) {
			soma = soma + Math.pow((valores[i] - media), 2);
		}
		variancia = soma/valores.length;
		return variancia;
	}
	
	public double desvioPadrao(double [] valores) {
		double variancia = variancia(valores);
		double desvioPadrao = 0.0;
		desvioPadrao = Math.sqrt(variancia);
		return desvioPadrao;
	}
	
	public static void imprimeValores(double [] valores) {
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}
}
