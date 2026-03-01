public class FormValidator {

    public boolean validar(String nombre, String email, String telefono, 
            String direccion, String ciudad, String codigoPostal) {

    	if (nombre == null || nombre.isEmpty()) return false;
		if (email == null || !email.contains("@")) return false;
		if (telefono == null || telefono.length() < 9) return false;
		if (direccion == null || direccion.isEmpty()) return false;
		if (ciudad == null || ciudad.isEmpty()) return false;
		if (codigoPostal == null || codigoPostal.length() != 5) return false;
		return true;
	}
}
