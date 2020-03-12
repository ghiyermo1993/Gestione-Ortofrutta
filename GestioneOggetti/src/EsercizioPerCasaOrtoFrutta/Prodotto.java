package EsercizioPerCasaOrtoFrutta;

import java.util.ArrayList;
import java.util.List;

import it.dstech.gestioneoggetti.framework.Automobile;

public class Prodotto {
	private String codice;
	private String nome;
	private double costo;
	private int quantita;
	
	
	public Prodotto(String codice, String nome, double costo, int quantita) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.costo = costo;
		this.quantita = quantita;
		
	}


	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", nome=" + nome + ", costo=" + costo + ", quantita=" + quantita + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		long temp;
		temp = Double.doubleToLongBits(costo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + quantita;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotto other = (Prodotto) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (Double.doubleToLongBits(costo) != Double.doubleToLongBits(other.costo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (quantita != other.quantita)
			return false;
		return true;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public int getQuantita() {
		return quantita;
	}


	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
}