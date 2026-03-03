# Refactoring Project 08 - Form Validator

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

Este proyecto forma parte de la asignatura **Entornos de Desarrollo**. El objetivo principal es la aplicación de técnicas de **Refactorización**, **Documentación técnica (JavaDoc)** y **Control de versiones (Git)** sobre un código fuente inicial para mejorar su legibilidad, mantenibilidad y calidad general (*Clean Code*).

## 👥 Miembros del Equipo
El trabajo ha sido desarrollado de forma colaborativa por:
*   **Oliver** ([@obiticadev](https://github.com/obiticadev)) - *Refactorización y Documentación.*
*   **Rubén** ([@rubenillob-dot](https://github.com/rubenillob-dot)) - *Refactorización y Gestión de Repositorio.*

## 🚀 Propósito del Proyecto
El código original consistía en una clase `FormValidator` con una lógica de validación de formularios compleja, métodos extensos y falta de tipado estructurado.
```Java
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
```

A través de este proyecto, se han aplicado patrones de diseño para:
1.  Reducir la complejidad de los métodos.
2.  Eliminar "Magic Numbers" (valores literales sin contexto).
3.  Agrupar parámetros relacionados en objetos de datos.
4.  Generar una documentación técnica accesible y profesional.

## 🛠️ Tecnologías y Herramientas
*   **Lenguaje:** Java 8+
*   **IDE:** Eclipse
*   **Control de Versiones:** Git & GitHub (Flujo de trabajo basado en ramas `feature/` y `develop`)
*   **Documentación:** JavaDoc (estándar HTML)

## 📁 Estructura del Repositorio
*   `/src`: Contiene el código fuente Java refactorizado.
*   `/docs`: Documentación técnica generada por JavaDoc (abrir `index.html`).
*   `/img`: Capturas de pantalla de las evidencias del proceso (PRs, configuración de ramas, etc.).
*   `MEMORIA.md`: Informe detallado con la justificación técnica de los patrones aplicados y las herramientas del IDE utilizadas.
