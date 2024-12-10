# Documento de Presentación: Gestor de Tutoriales

---

## **Título del Proyecto:**  
Gestor de Tutoriales  

## **Descripción General:**  
El Gestor de Tutoriales es una aplicación diseñada para facilitar la administración y consulta de tutoriales organizados por categorías. Permite a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) tanto en las categorías como en los tutoriales, brindando una interfaz intuitiva para gestionar esta información.  

---

## **Tecnologías Utilizadas**

### **Backend:**
- **Lenguaje:** Java.
- **Frameworks/Librerías:** JDBC para la conexión con la base de datos, Servlets para manejar las solicitudes y respuestas HTTP.
- **Base de Datos:** MySQL.
- **Patrones de Diseño:** Clases especializadas para manejar la lógica de negocio (Gestión de Tutoriales y Categorías) y la conexión a la base de datos (`Conexion`).

### **Frontend:**
- **HTML5, CSS3:** Para la estructura y el diseño básico.
- **Bootstrap:** Para diseño responsivo y componentes visuales.
- **SweetAlert:** Para mostrar alertas dinámicas y atractivas.

---

## **Funcionalidades**

1. **Gestión de Categorías (CRUD):**  
   Permite administrar las categorías de los tutoriales para facilitar su organización.  
   - Backend: Valida y almacena las categorías en la tabla `categorias`.  
   - Frontend: Interfaz con formularios y listas dinámicas para gestionar categorías.  
   - **Ejemplo:**  
     - Categoría: *Programación*.  

2. **Agregar Tutorial:**  
   Permite al usuario ingresar un nuevo tutorial especificando:  
   - **Título:** *Tutorial de Java*.  
   - **URL:** *http://ejemplo/youtube.com*.  
   - **Prioridad:** Escala del 1 al 10 (10 = mayor prioridad).  
   - **Estado:** *No visto* o *Visto*.  
   - **Categoría:** Seleccionada de una lista de categorías previamente registradas.  
   - Backend: Valida los datos e inserta el tutorial en la base de datos.  
   - Frontend: Proporciona un formulario estilizado con Bootstrap y notifica al usuario mediante SweetAlert.

3. **Listar Tutoriales:**  
   Muestra un listado de los tutoriales junto con su categoría, estado y prioridad.  
   - Backend: Recupera los datos y los organiza.  
   - Frontend: Tabla responsiva estilizada con opciones para editar o eliminar tutoriales.

4. **Editar Tutorial:**  
   Permite modificar la información de un tutorial, incluida su categoría.  
   - Backend: Actualiza los datos según el ID del tutorial.  
   - Frontend: Formulario dinámico para cargar y modificar la información del tutorial seleccionado.

5. **Eliminar Tutorial:**  
   Permite al usuario eliminar un tutorial específico.  
   - Backend: Ejecuta una operación SQL `DELETE` basada en el ID.  
   - Frontend: Solicita confirmación con SweetAlert antes de proceder.

---

## **Arquitectura del Sistema**

### **Modelo de Datos:**  
La base de datos incluye dos tablas principales:  
1. **`categorias`:**  
   - `idCategoria`: Identificador único.  
   - `nombre`: Nombre de la categoría.  
2. **`tutoriales`:**  
   - `idTutorial`: Identificador único.  
   - `titulo`: Título del tutorial.  
   - `url`: Enlace al tutorial.  
   - `prioridad`: Nivel de importancia.  
   - `estado`: Estado del tutorial (*Visto*/*No visto*).  
   - `idCategoria`: Clave foránea que relaciona el tutorial con una categoría.

### **Componentes del Código:**  
- `Categoria`: Clase de modelo para representar una categoría.  
- `Tutorial`: Clase de modelo para representar un tutorial.  
- `GestionarCategorias`: Clase para manejar las operaciones CRUD de categorías.  
- `GestionarTutoriales`: Clase para manejar las operaciones CRUD de tutoriales.  
- `Conexion`: Clase para gestionar la conexión con la base de datos.  
- **Servlets:** Controladores que manejan las solicitudes HTTP desde el frontend hacia el backend para realizar las operaciones CRUD.

---

## **Flujo de Trabajo**

1. **Gestión de Categorías:**  
   - El usuario accede al módulo de categorías y puede crear nuevas, ver las existentes, editarlas o eliminarlas.  

2. **Agregar Tutorial:**  
   - El usuario selecciona una categoría existente al momento de registrar un tutorial, asegurando una organización eficiente.  

3. **Navegación General:**  
   - Menú principal con opciones para gestionar categorías, agregar tutoriales y listar la información.

4. **Operaciones CRUD:**  
   - Las operaciones se realizan con validaciones en el backend y retroalimentación visual en el frontend.  

---

## **Conclusión**


El Gestor de Tutoriales es un proyecto pequeño pero funcional que organiza tutoriales por categorías de forma sencilla. Es una base práctica para futuros desarrollos más complejos. 


