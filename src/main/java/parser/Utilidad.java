package parser;

public class Utilidad {
	
	private String dirEntrada;
	private String dirSalida;
	private String nomArchivo;
	private String archivoTodo;
	
	public Utilidad(String dirEntrada, String dirSalida) {
		super();
		this.dirEntrada = dirEntrada;
		this.dirSalida = dirSalida;
		this.archivoTodo = dirSalida + "todo.salida.txt";
	}
	
	public String getArchivoTodo() {
		return archivoTodo;
	}

	public void setArchivoTodo(String archivoTodo) {
		this.archivoTodo = archivoTodo;
	}

	public String getDirEntrada() {
		return dirEntrada;
	}

	public void setDirEntrada(String dirEntrada) {
		this.dirEntrada = dirEntrada;
	}

	public String getDirSalida() {
		return dirSalida;
	}

	public void setDirSalida(String disSalida) {
		this.dirSalida = disSalida;
	}

	public String getNomArchivo() {
		return nomArchivo;
	}

	public void setNomArchivo(String nomArchivo) {
		this.nomArchivo = nomArchivo;
	}
	
	
}
