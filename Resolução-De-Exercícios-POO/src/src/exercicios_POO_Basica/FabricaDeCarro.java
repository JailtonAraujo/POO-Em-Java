package src.exercicios_POO_Basica;

public class FabricaDeCarro {
	private static FabricaDeCarro UnicaInstacia;
	private int id;
	private String marca;
	
	
	
	private static FabricaDeCarro getUnicaInstacia() {
		return UnicaInstacia;
	}

	private static void setUnicaInstacia(FabricaDeCarro unicaInstacia) {
		UnicaInstacia = unicaInstacia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public FabricaDeCarro() {}
	
	public static FabricaDeCarro getInstance() {
		if(UnicaInstacia == null) {
			UnicaInstacia = new FabricaDeCarro();
		}
		
		return UnicaInstacia;
	}

	@Override
	public String toString() {
		return "FabricaDeCarro [id=" + id + ", marca=" + marca + "]";
	}
	
	
	
}
