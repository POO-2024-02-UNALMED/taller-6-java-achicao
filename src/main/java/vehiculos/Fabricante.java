package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	
	public Fabricante() {
		fabricantes.add(this);
	}
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricanteMasVendedor = null;
		int maxRepeticiones = 0;
		
		for (int i = 0;i < fabricantes.size();i++) {
			Fabricante fabricante = fabricantes.get(i);
			String nombreFabricante = fabricante.getNombre();
			int contador = 0;
			
			for (int r = 0;r < fabricantes.size();r++) {
				if(fabricantes.get(r).getNombre() == nombreFabricante) {
					contador++;
				}
			}
			
			if (contador > maxRepeticiones) {
				maxRepeticiones = contador;
				fabricanteMasVendedor = fabricante;
			}
			
		}
		
		return fabricanteMasVendedor;
	}
	
	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	public Pais getPais() {
	    return pais;
	}

	public void setPais(Pais pais) {
	    this.pais = pais;
	}
}
