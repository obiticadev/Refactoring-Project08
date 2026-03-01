
/**
 * @author Oliver y Ruben
 * @version 1.0
 */

/**
     * Constructor para inicializar todos los campos del formulario
     * 
     * @param nombre Nombre completo del usuario
     * @param email Dirección de correo electrónico
     * @param telefono Número de teléfono de contacto
     * @param direccion Dirección postal de residencia
     * @param ciudad Ciudad de residencia
     * @param codigoPostal Código postal (debe tener 5 dígitos)
     */
public class DatosFormulario {
	public String nombre;
	public String email;
	public String telefono;
	public String direccion;
	public String ciudad;
	public String codigoPostal;

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