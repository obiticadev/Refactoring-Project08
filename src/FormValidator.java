public class FormValidator {

    private static final String SEPARADOR_CORREO = "@";
	private static final int CODIGO_POSTAL = 5;
	private static final int LONGITUD_TELEFONO = 9;

	public boolean validar(DatosFormulario parameterObject) {

    	if (parameterObject.nombre == null || parameterObject.nombre.isEmpty()) return false;
		if (parameterObject.email == null || !parameterObject.email.contains(SEPARADOR_CORREO)) return false;
		if (parameterObject.telefono == null || parameterObject.telefono.length() < LONGITUD_TELEFONO) return false;
		if (parameterObject.direccion == null || parameterObject.direccion.isEmpty()) return false;
		if (parameterObject.ciudad == null || parameterObject.ciudad.isEmpty()) return false;
		if (parameterObject.codigoPostal == null || parameterObject.codigoPostal.length() != CODIGO_POSTAL) return false;
		return true;
	}
}
