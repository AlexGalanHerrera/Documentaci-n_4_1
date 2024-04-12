/**
 * Esta clase representa a un empleado.
 * @author Alejandro galán herrera
 * @version 1.0
 */
public class Empleado {

	private String pobla;
	private String oficio;
	private Double salario;
	private Departamento dept;

	/**
	 * Establece la población del empleado.
	 * @param pobla la población del empleado.
	 */
	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	/**
	 * Obtiene el oficio del empleado.
	 * @return el oficio del empleado.
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
	 */
	public Departamento getDept() {
		return dept;
	}

	/**
	 * Establece el departamento del empleado.
	 * @param dept el departamento del empleado.
	 */
	public void setDept(Departamento dept) {
		this.dept = dept;
	}

	/**
	 * Aumenta el salario del empleado en una cantidad determinada.
	 * @param subida la cantidad en la que se aumenta el salario.
	 */
	public void subidasalario(Double subida) {
		salario = salario + subida;
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
}
