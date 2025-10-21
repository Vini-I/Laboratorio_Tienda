# 🏪 Proyecto: Sistema de Administración de Tienda

## 📋 Descripción

Este proyecto corresponde al curso **Programación II (ITI-321)** de la carrera de Ingeniería en Tecnologías de Información de la **Universidad Técnica Nacional (UTN)**.

El sistema implementa una **aplicación de escritorio en Java** orientada a objetos para administrar una tienda que gestiona:
- 🗂️ **Categorías de productos**
- 📦 **Productos vinculados a sus categorías**
- 👤 **Clientes y sus métodos de pago**
- 🧾 **Facturas y sus ítems**
- 📢 **Notificaciones por diferentes canales** (correo, SMS, WhatsApp o pantalla)

El diseño sigue principios de **buenas prácticas**, **encapsulamiento**, **separación por capas** y aplicación progresiva de **patrones de diseño**.

---

## 🧠 Objetivos de aprendizaje

1. Aplicar conceptos de **Programación Orientada a Objetos (POO)** en Java.
2. Implementar **patrones de diseño y arquitectura** para mejorar mantenibilidad y extensibilidad.
3. Desarrollar software modular y escalable con separación entre lógica de negocio y persistencia.
4. Comprender la importancia del diseño limpio y la codificación segura.

Factory Method: Se aplica el patron de diseño al paquete de clientes especificamente a los metodos de pago, para que a futuro si se tiene que añadir nuevos metodos de pago,
no se tenga que cambiar en todo el codigo el new MetodoPago(), sino que solamente utilice el factory para respetar el principio solid OCP. Asi para no tener que modificar el codigo
interno a futuro al momento de querer hacer una extension de funcionalidades (Como añadir un nuevo metodo de pago), solamente se añade una nueva opcion al metodo del factory.

Builder: Se implemento el metodo builder en la clase Producto por la cantidad de parametros que esta posee,
ya que al ser 5 parametros estos se acumulan mucho en un solo constructor.

Iterator: Se aplica en todas las clases que tengan una lista en este proyecto esas clases serian las Repositorio y
sus metodos en las clases de Servicios y por ultimo modificar las llamadas del iterador en el main, en las unicas clases
implementadas fuero en RepositorioCategorias,ServicioCatalogo y App

Strategy: Se implemento en la fabrica de metodos de pago con el objetivo de simplificar y eliminar la necesidad de modificar el codigo de la fabrica cada que se quiera
agregar un metodo de pago nuevo al codigo.

## ⚙️ Estructura del proyecto
📦 src/
├── App.java # Clase principal
│
├── 🗂️ Catálogo
│ ├── Categoria.java
│ ├── Producto.java
│ ├── RepositorioCategorias.java
│ ├── RepositorioProductos.java
│ └── ServicioCatalogo.java
│
├── 👤 Clientes
│ ├── Cliente.java
│ ├── MetodoPago.java
│ ├── TipoMetodoPago.java
│ ├── RepositorioClientes.java
│ └── ServicioClientes.java
│
├── 🧾 Facturación
│ ├── Factura.java
│ ├── ItemFactura.java
│ ├── EstadoFactura.java
│ ├── RepositorioFacturas.java
│ └── ServicioFacturacion.java
│
├── 📢 Notificaciones
│ ├── CanalNotificacion.java
│ ├── EstadoNotificacion.java
│ ├── Notificacion.java
│ └── ServicioNotificaciones.java
│
└── README.md

## 🧩 Patrones de diseño aplicados
