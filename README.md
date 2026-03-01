# Memoria de Proyecto: Optimización, Documentación y Control de Versiones
**Proyecto:** Refactoring-Project08  
**Asignatura:** Entornos de Desarrollo  
**Autores:** Oliver y Rubén  

---

# 1. Configuración del Repositorio GIT

Lo primero que hicimos fue crear el repositorio desde mi perfil como público.

<div align="center">
  <img src="img/01%20Creación%20de%20repositorio.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 1: Creando repositorio público.</i></p>

## Colaboradores
Se agregaron los colboradores del proyecto

<div align="center">
  <img src="img/04 Colaborador.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 2: Evidencia de colaboradores añadidos al repositorio.</i></p>

## Protección de Ramas
Se ha protegido la rama `master` para impedir "pushes" directos, obligando a realizar una **Pull Request** y revisión de código antes de cualquier integración.

<div align="center">
  <img src="img/02%20Creación%20de%20repositorio.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 3: Aplicando reglas de Pull Request para la rama master.</i></p>

Lo mismo hicimos para la rama `develop` con las mismas reglas.

```bash
# Comando para crear la rama develop y saltar en ella
git checkout -b develop

# Subir la nueva rama al repositorio remoto de GitHub
git push origin develop
```

<div align="center">
  <img src="img/03%20Creación%20de%20repositorio.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 4: Aplicando reglas de Pull Request para la rama develop.</i></p>

## Gestión de Ramas y Flujo de Trabajo
Se ha utilizado un modelo de ramificación basado en `feature/` y `javadoc/` para cada refactorización y cambio en el JavaDoc respectivamente integrando primero en la rama `develop`.

<div align="center">
  <img src="img/05 Ramas.png" height="400" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 5: Ramas creadas.</i></p>

---

# 2. Identificación de Patrones

Tras analizar el código original de la clase `FormValidator`, se identificaron los siguientes casos de posibles refactorizaciones y sus soluciones:

## 1. **Long Parameter List:** El método `validar` recibía 6 parámetros String. **(Elaborado por Rubén)**
   - *Solución:* Patrón **Introduce Parameter Object** creando la clase `DatosFormulario`.
   <div align="center">
   <img src="img/06 Feature extraer Clase.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 6: Seleccionando refactorización en el menú contextual proporcionado por eclipse.</i></p>
   <div align="center">
   <img src="img/07 Feature extraer Clase.png" height="450" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 7: Configurando parámetros de refactorización.</i></p>
   <div align="center">
   <img src="img/08 Feature extraer Clase.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 8: Revisión del resultado final FormValidator.</i></p>
   <div align="center">
   <img src="img/09 Feature extraer Clase.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 9: Revisión del resultado final DatosFormulario.</i></p>

## 2. **Magic Numbers:** Uso de valores literales como `9` o `5`. **(Elaborado por Rubén)**
   - *Solución:* Patrón **Replace Magic Number** mediante constantes `private static final`.
   <div align="center">
   <img src="img/10 Feature extraer Const.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 10: Seleccionando refactorización en el menú contextual proporcionado por eclipse.</i></p>
   <div align="center">
   <img src="img/11 Feature extraer Const.png" height="450" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 11: Configurando parámetros de refactorización.</i></p>
   <div align="center">
   <img src="img/12 Feature extraer Const.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 12: Revisión del resultado final.</i></p>

## 3. **Long Method / Logic Clutter:** El método realizaba todas las validaciones en un solo bloque. **(Elaborado por Oliver)**
   - *Solución:* Patrón **Extract Method** para crear validaciones independientes.
   <div align="center">
   <img src="img/13 Feature extraer Method.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 13: Seleccionando refactorización en el menú contextual proporcionado por eclipse.</i></p>
   <div align="center">
   <img src="img/14 Feature extraer Method.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 14: Comprobando primera extracción.</i></p>
   <div align="center">
   <img src="img/15 Feature extraer Method.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 15: Revisión del resultado final.</i></p>
   <div align="center">
   <img src="img/16 Pull Request Feature extraer Method.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
   </div>
   <p align="center"><i>Figura 16: Subida de cambios de la rama en cuestión al repositorio remoto.</i></p>

---

# 3. Aprobación de *Pull Request* a la rama `develop` desde diferentes perspectivas

<div align="center">
<img src="img/17 Pull Request Merge extraer Class.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 17: Pull Request lanzada por Rubén, comentada por Oliver y aprobada por Oliver.</i></p>
<div align="center">
<img src="img/18 Pull Request Extraer Const pendiente aprobación.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 18: Pull Request lanzada por Rubén, comentada por Oliver y pendiente por aprobación de Oliver.</i></p>
<div align="center">
<img src="img/19 Pull Request Notificación Extraer Method.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 19: Pull Request lanzada por Oliver, comentada por Rubén y pendiente por aprobación de Oliver.</i></p>


---

# 4. Documentación Técnica JavaDoc

Se ha documentado todo el código fuente utilizando la sintaxis estándar de JavaDoc, incluyendo etiquetas `@param`, `@return`, `@author` y `@version`.
Y para recuperar el trabajo de mi compañero utilizamos los siguientes comandos para recuperar las ramas del repositorio remoto y poder ver las que tenemos en local:
### 1. Listar todas las ramas (locales y remotas) para ver el estado actual
```bash
git branch -a
```
### 2. Actualizar el repositorio local con la información del remoto
Esto "trae" las ramas nuevas pero no modifica tus archivos de trabajo
```bash
git fetch origin
```
### 3. Comprobar que las nuevas ramas remotas ya aparecen en la lista (en rojo)
```bash
git branch -a
```

### 4. Conectarla con la rama local traide del repositorio remoto
```bash
git switch nombre_de_la_rama
```
<div align="center">
<img src="img/20 Traer Ramas para continuar trabajo.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 20: Comandos para recuperar la rama del compañero.</i></p>

## Generación de Documentación
Se utilizó el asistente de Eclipse para generar el portal HTML de documentación, configurando la visibilidad en `Private` para incluir todos los métodos extraídos.

<div align="center">
<img src="img/21 JavaDoc Configuración.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 21: Configurando parámetros de JavaDoc.</i></p>
<div align="center">
<img src="img/22 JavaDoc Generando HTML.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 22: Generando JavaDoc.</i></p>

## Resultado Final (Portal HTML)
La documentación final es accesible a través del archivo `index.html` generado en la carpeta `docs/`.

<div align="center">
<img src="img/23 JavaDoc Revisión Final.png" width="900" style="border: 2px solid #ccc; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); margin: 10px;">
</div>
<p align="center"><i>Figura 23: Revisión final de JavaDoc.</i></p>