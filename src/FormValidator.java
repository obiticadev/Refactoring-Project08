/**
 * 
 * Proporciona métodos para validar la integridad de los datos del formulario
 * 
 * @author Ruben y Oliver
 * @version 1.1
 */
public class FormValidator {
	/** 
	 * Separador utilizado para validar el formato de las direcciones de correo.
	 * */
    private static final String SEPARADOR_CORREO = "@";
    /** 
     * Longitud exacta que debe tener un Código Postal en España. 
     * */
	private static final int CODIGO_POSTAL = 5;
	/** 
	 * Longitud mínima requerida para un número de teléfono válido. 
	 * */
	private static final int LONGITUD_TELEFONO = 9;

	/**
	 * Valida de forma integral el objeto de datos del formulario.
	 * 
	 * @param parameterObject Objeto que contiene todos los datos a validar.
	 * @return true si todos los campos son validos.
	 */
	public boolean validar(DatosFormulario parameterObject) {

    	if (!isNombreValido(parameterObject)) return false;
		if (!isEmailValido(parameterObject)) return false;
		if (!isTelefonoValido(parameterObject)) return false;
		if (!isDireccionValida(parameterObject)) return false;
		if (!isCiudadValida(parameterObject)) return false;
		if (!isCodigoPostalValido(parameterObject)) return false;
		return true;
	}

	/**
	 * Valida si el nombre dentro del objeto es correcto.
	 * 
	 * @param parameterObject Objeto con el campo Nombre.
	 * @return Si el nombre es correcto.
	 */
	public boolean isNombreValido(DatosFormulario parameterObject) {
		return parameterObject.nombre == null || parameterObject.nombre.isEmpty();
	}
	/**
	 * Valida si el email dentro del objeto es correcto
	 * 
	 * @param parameterObject Objeto con el campo Email.
	 * @return Si el Email es correcto.
	 */
	public boolean isEmailValido(DatosFormulario parameterObject) {
		return parameterObject.email == null || !parameterObject.email.contains(SEPARADOR_CORREO);
	}
	/**
	 * Valida si el teléfono dentro del objeto es correcto.
	 * 
	 * @param parameterObject Objeto con el campo Telefono.
	 * @return Si el Telefono es correcto.
	 */
	public boolean isTelefonoValido(DatosFormulario parameterObject) {
		return parameterObject.telefono == null || parameterObject.telefono.length() < LONGITUD_TELEFONO;
	}
	/**
	 * Valida si la dirección dentro del objeto es correcto.
	 * 
	 * @param parameterObject Objeto con el campo Direccion.
	 * @return Si el Direccion es correcto.
	 */
	public boolean isDireccionValida(DatosFormulario parameterObject) {
		return parameterObject.direccion == null || parameterObject.direccion.isEmpty();
	}
	/**
	 * Valida si la ciudad dentro del objeto es correcto.
	 * 
	 * @param parameterObject Objeto con el campo Ciudad.
	 * @return Si el Ciudad es correcto.
	 */
	public boolean isCiudadValida(DatosFormulario parameterObject) {
		return parameterObject.ciudad == null || parameterObject.ciudad.isEmpty();
	}
	/**
	 * Valida si el codigo postal dentro del objeto es correcto.
	 * 
	 * @param parameterObject Objeto con el campo Codigo Postal.
	 * @return Si el Codigo Postal es correcto.
	 */
	public boolean isCodigoPostalValido(DatosFormulario parameterObject) {
		return parameterObject.codigoPostal == null || parameterObject.codigoPostal.length() != CODIGO_POSTAL;
	}





}
