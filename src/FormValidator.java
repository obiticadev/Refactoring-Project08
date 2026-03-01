public class FormValidator {

    public boolean validar(DatosFormulario parameterObject) {

    	if (parameterObject.nombre == null || parameterObject.nombre.isEmpty()) return false;
		if (parameterObject.email == null || !parameterObject.email.contains("@")) return false;
		if (parameterObject.telefono == null || parameterObject.telefono.length() < 9) return false;
		if (parameterObject.direccion == null || parameterObject.direccion.isEmpty()) return false;
		if (parameterObject.ciudad == null || parameterObject.ciudad.isEmpty()) return false;
		if (parameterObject.codigoPostal == null || parameterObject.codigoPostal.length() != 5) return false;
		return true;
	}
}
