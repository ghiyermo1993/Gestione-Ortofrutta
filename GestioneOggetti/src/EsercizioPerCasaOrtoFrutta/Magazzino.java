package EsercizioPerCasaOrtoFrutta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Magazzino implements Serializable {
	private List<Cliente> listaCliente;
	private List<Prodotto> listaProdotti;
	
	
	
	public Magazzino() {
		this.listaCliente = new ArrayList<>();
		this.listaProdotti= new ArrayList<>();
		
	}
	
	public boolean aggiungiProdotto(Prodotto p1) {
		if(!listaProdotti.contains(p1)){
			this.listaProdotti.add(p1);
			return true;
		}
		int posizione = this.listaProdotti.indexOf(p1);
		Prodotto prodotto =listaProdotti.get(posizione);
		prodotto.setQuantita(prodotto.getQuantita()+ p1.getQuantita());
		return true;
		
	}
    public boolean rimuoviProdotto (Prodotto p1) {
    	return this.listaProdotti.remove(p1);
    		
    }
    public boolean modificaCosto (Prodotto p1, double costo ) {
    	p1.setCosto(costo);
    	return true;
    }
    public boolean vendiProdotto (Prodotto p1, int quantita) {
    	int posizione = this.listaProdotti.indexOf(p1);
    	Prodotto prodotto = listaProdotti.get(posizione);
    	prodotto.setQuantita(prodotto.getQuantita()- quantita);
    	return true;
    }
    public boolean checkVenditaProdotto(Prodotto p1, int quantita) {
    	int posizione = this.listaProdotti.indexOf(p1);
    	Prodotto prodotto = listaProdotti.get (posizione);
    	if (prodotto.getQuantita()> quantita) {
    		return true;
    	}
    	return false;
    }
    public boolean vendiProdotto(Cliente c, Prodotto p) {
    	int posizioneCliente = this.listaCliente.indexOf(c);
    	Cliente cliente = this.listaCliente.get(posizioneCliente);
    	return cliente.aggiungiProdotto(p);
    }
    public boolean stampaListaProdotti() {
    	
    }
}
