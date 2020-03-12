package EsercizioPerCasaOrtoFrutta;
import java.util.Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class MainOrtoFrutta {
	private static final String NOME_FILE_MAGAZZINO = "negozio.ovs";
	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		Magazzino magazzino = caricaMagazzino();
		while (true) {
			menu();		
			int scelta = scanner.nextInt();
			scanner.nextLine();
			switch (scelta) {
			case 1: {
				aggiungiProdotto(scanner,magazzino);
				break;
			}
			case 2: {
				System.out.println("Scegli quale prodotto vuoi eliminare. ");
				magazzino.stampaListaProdotti();
//				String rimuoviProdotto = input.nextLine();
//				magazzino.rimuoviProdotto(rimuoviProdotto);
//				break;
				
			}

	}
}
			} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();

			
}
	}		

	private static void menu() {
		System.out.println("1) aggiungi prodotto");
		System.out.println("2) rimuovi prodotto");
		System.out.println("3) cambia costo prodotto");
		System.out.println("4) crea prodotto");
		System.out.println("5) vendi prodotto");
		System.out.println("6) prodotto piu cari");
		System.out.println("7) prodotto piu economici");
		System.out.println("8) clienti spendaccioni");
		System.out.println("9) cienti poveryh");
		System.out.println("10) prodotto venduto");
		System.out.println("11) prodotto meno cari");
		
	}
	
	private static void aggiungiProdotto (Scanner scanner, Magazzino magazzino) {
		System.out.println("Inserisci l'id del prodotto");
		String id = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Inserisci la descrizione");
		String descrizione = scanner.nextLine();
		System.out.println("Inserisci il costo del prodotto");
		double costo = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Inserisci quanti prodotti in magazzino ci sono");
		int qta = scanner.nextInt();
		scanner.nextLine();
		Prodotto p = new Prodotto(id, descrizione, costo, qta);
		magazzino.aggiungiProdotto(p);

	}
	
	
	
	private static Magazzino caricaMagazzino() throws IOException, ClassNotFoundException {

		File file = new File(NOME_FILE_MAGAZZINO);
		if (!file.exists()) {
			return new Magazzino();
		}
		FileInputStream in = new FileInputStream(file);
		ObjectInputStream stream = new ObjectInputStream(in);
		Magazzino n = (Magazzino) stream.readObject();
		stream.close();
		return n;
	}
}

	