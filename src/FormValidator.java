public class FormValidator {

    private static final String SEPARADOR_CORREO = "@";
	private static final int CODIGO_POSTAL = 5;
	private static final int LONGITUD_TELEFONO = 9;

	public boolean validar(DatosFormulario parameterObject) {

    	if (!isNombreValido(parameterObject)) return false;
		if (!isEmailValido(parameterObject)) return false;
		if (!isTelefonoValido(parameterObject)) return false;
		if (!isDireccionValida(parameterObject)) return false;
		if (!isCiudadValida(parameterObject)) return false;
		if (!isCodigoPostalValido(parameterObject)) return false;
		return true;
	}

	public boolean isNombreValido(DatosFormulario parameterObject) {
		return parameterObject.nombre == null || parameterObject.nombre.isEmpty();
	}
	
	public boolean isEmailValido(DatosFormulario parameterObject) {
		return parameterObject.email == null || !parameterObject.email.contains(SEPARADOR_CORREO);
	}
	
	public boolean isTelefonoValido(DatosFormulario parameterObject) {
		return parameterObject.telefono == null || parameterObject.telefono.length() < LONGITUD_TELEFONO;
	}
	
	public boolean isDireccionValida(DatosFormulario parameterObject) {
		return parameterObject.direccion == null || parameterObject.direccion.isEmpty();
	}
	
	public boolean isCiudadValida(DatosFormulario parameterObject) {
		return parameterObject.ciudad == null || parameterObject.ciudad.isEmpty();
	}
	
	public boolean isCodigoPostalValido(DatosFormulario parameterObject) {
		return parameterObject.codigoPostal == null || parameterObject.codigoPostal.length() != CODIGO_POSTAL;
	}





}
