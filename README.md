# API CRUD de Usuarios

Este proyecto es una API REST desarrollada con Spring Boot.

## Funcionalidades

- Crear usuario
- Listar usuarios
- Actualizar usuario
- Eliminar usuario
- Validaciones
- Manejo de errores

## Tecnologías

- Java
- Spring Boot
- MySQL
- JPA (Hibernate)

## Endpoints

POST /usuarios  
GET /usuarios  
PUT /usuarios/{id}  
DELETE /usuarios/{id}
##  Pruebas con Postman

Ejemplo de creación de usuario:

POST /usuarios

{
  "nombre": "Carlos",
  "correo": "carlos@email.com"
}
##  Arquitectura

- Controller → Manejo de peticiones
- Service → Lógica de negocio
- Repository → Acceso a datos
