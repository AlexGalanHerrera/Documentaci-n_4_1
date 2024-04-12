/**
 * Esta clase representa a un empleado.
 * @author Alejandro Galán Herrera
 * @version 1.0
 * @since 12/04/2024
 * @deprecated Esta clase puede ser eliminada en futuras versiones.
 * @see Departamento
 */
public class Empleado {

	private String pobla;
	private String oficio;
	private Double salario;
	private Departamento dept;

	/**
	 * Obtiene el oficio del empleado.
	 * @return el oficio del empleado.
	 * @serialData El oficio del empleado.
	 */
	public String getOficio() {
		return oficio;
	}

	/**
	 * Establece el oficio del empleado.
	 * @param oficio el oficio del empleado.
	 */
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	/**
	 * Obtiene el salario del empleado.
	 * @return el salario del empleado.
	 * @deprecated Este método será eliminado en futuras versiones.
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * Establece el salario del empleado.
	 * @param salario el salario del empleado.
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/**
	 * Obtiene el departamento del empleado.
	 * @return el departamento del empleado.
	 * @see Departamento
	 */
	public Departamento getDept() {
		return dept;
	}

	/**
	 * Establece el departamento del empleado.
	 * @param dept el departamento del empleado.
	 * @serialData El departamento del empleado.
	 */
	public void setDept(Departamento dept) {
		this.dept = dept;
	}

	/**
	 * Aumenta el salario del empleado en una cantidad determinada.
	 * @param subida la cantidad en la que se aumenta el salario.
	 * @deprecated Este método será eliminado en futuras versiones.
	 */
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}

	/**
	 * Aumenta el salario del empleado en una cantidad determinada.
	 * @param subida la cantidad en la que se aumenta el salario.
	 */
	public void subirSalario(Double subida) {
		salario += subida;
	}

	/**
	 * Verifica si el nombre del empleado está vacío.
	 * @return true si el nombre no está vacío, false de lo contrario.
	 */
	private boolean comprobar() {
		String nombre = null;
		if (nombre.equals("")) {
			return false;
		}
		return true;
	}
	/**
	 * Establece la población del empleado.
	 * @param pobla la población del empleado.
	 * @throws IllegalArgumentException si la población proporcionada es nula.
	 */
	public void setPobla(String pobla) throws IllegalArgumentException {
		if (pobla == null) {
			throw new IllegalArgumentException("La población no puede ser nula.");
		}
		this.pobla = pobla;
	}

}

