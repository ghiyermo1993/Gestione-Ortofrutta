package EsercizioPerCasaOrtoFrutta;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cognome;
	private List<Prodotto> listaFruttaComprata;
	
	public Cliente(String cognome, String nome) {
		super();
		this.cognome = cognome;
		this.setFruttaComprata( listaFruttaComprata);
		this.nome = nome;
		this. listaFruttaComprata = new ArrayList<Prodotto>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public List<Prodotto> getFruttaComprata() {
		return  listaFruttaComprata;
	}
	public void setFruttaComprata(List<Prodotto> fruttaComprata) {
		this. listaFruttaComprata = fruttaComprata;
	}
	
	public boolean aggiungiProdotto (Prodotto p) {
		this. listaFruttaComprata.add(p);
		return false;
	}
	
}