package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises;
	
	public Pais() {
		paises.add(this);
	}
	
	public Pais(String nombre){
		this.nombre = nombre;
		paises.add(this);
	}
	
	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais paisMasVendedor = null;
		int maxRepeticiones = 0;
		
		for (int i = 0;i < paises.size();i++) {
			String elemento = paises.get(i).getNombre();
			int contador = 0;
			
			for (int r = 0;i < paises.size();i++) {
				if(paises.get(r).getNombre() == elemento) {
					contador++;
				}
			}
			
			if (contador > maxRepeticiones) {
				maxRepeticiones = contador;
				paisMasVendedor = paises.get(i);
			}
			
		}
		
		return paisMasVendedor;
	}

}
