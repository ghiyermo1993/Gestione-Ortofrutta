package EsercizioPerCasaOrtoFrutta;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class GestioneSalvataggioOrtoFrutta {
	public static void main(String[] args) {

		try {
			File file = new File("esempio.obj");
			FileInputStream in = new FileInputStream(file);
			ObjectInputStream stream = new ObjectInputStream(in);
			List<Cliente> p = (List<Cliente>) stream.readObject();
			for (Cliente persona : p) {
				System.out.println(persona);
			}
			stream.close();
		} catch (IOException ext) {
			System.out.println("Eccezione");
			ext.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
