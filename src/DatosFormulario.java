
/**
 * Clase que representa los datos recogidos en el formulario
 * 
 * @author Oliver y Ruben
 * @version 1.0
 */


public class DatosFormulario {
	/** Nombre del usuario */
	public String nombre;
	/** Email del usuario */
	public String email;
	/** Telefono del usuario */
	public String telefono;
	/** Direccion del usuario */
	public String direccion;
	/** Ciudad del usuario */
	public String ciudad;
	/** Codigo postal del usuario */
	public String codigoPostal;

	/**
	 * Constructor para inicializar el objeto de datos del formulario.
	 * 
	 * @param nombre Nombre completo
	 * @param email Correo electronico
	 * @param telefono Numero de telefono
	 * @param direccion Direccion postal
	 * @param ciudad Ciudad de residencia
	 * @param codigoPostal Codigo postal de 5 digitos
	 */

	public DatosFormulario(String nombre, String email, String telefono, String direccion, String ciudad,
			String codigoPostal) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}
}