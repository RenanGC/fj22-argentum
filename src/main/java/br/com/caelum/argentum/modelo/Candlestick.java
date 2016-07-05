package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Candlestick {
	public final double abertura;
	public final double fechamento;
	public double minimo;

	/**
	 * @param minimo
	 *            the minimo to set
	 */
	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	public final double maximo;
	public final double volume;
	public final Calendar data;

	public Candlestick(double abertura, double fechamento, double minimo,
			double maximo, double volume, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	/**
	 * @return the abertura
	 */
	public double getAbertura() {
		return abertura;
	}

	/**
	 * @return the fechamento
	 */
	public double getFechamento() {
		return fechamento;
	}

	/**
	 * @return the minimo
	 */
	public double getMinimo() {
		return minimo;
	}

	/**
	 * @return the maximo
	 */
	public double getMaximo() {
		return maximo;
	}

	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	public boolean isAlta() {
		return this.abertura > this.fechamento;
	}

	public boolean isBaixa() {
		return this.abertura < this.fechamento;
	}

}
