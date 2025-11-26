# 1.6 Java Generics - Nivel 1

## 📄 Descripción

Este proyecto contiene la implementación de dos ejercicios del Sprint 1.06 - Generics en Java.

### Ejercicio 1: NoGenericMethods

Clase genérica `NoGenericMethods<T>` que almacena tres argumentos del mismo tipo. Incluye:

- Constructor para inicializar los tres valores
- Getters y setters para cada posición
- Validación de argumentos nulos

### Ejercicio 2: GenericMethods

Clase `Person` con atributos name, surname y age, junto con clase `GenericMethods` que contiene un método genérico `<T, U, V>` que acepta tres argumentos de tipos diferentes y los imprime por pantalla.

---

## 💻 Tecnologías Utilizadas

- **Java 17**
- **Maven** - Gestión de dependencias y build
- **IntelliJ IDEA** - Entorno de desarrollo integrado
- **Git** - Control de versiones
- **JUnit 5 (Jupiter)** - Framework de testing

---

## 📋 Requisitos

Para ejecutar este proyecto necesitas:

- **Java Development Kit (JDK) 17** o superior
- **Maven 3.6+**
- **IntelliJ IDEA** (Community o Ultimate) o cualquier IDE compatible con Java
- **Git** para clonar el repositorio

---

## 🛠️ Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/hmirodski/1.6-Java_language_nivell1.git
```

### 2. Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA
2. Selecciona `File` → `Open`
3. Navega hasta la carpeta del proyecto y selecciónala
4. Click en `OK`
5. IntelliJ detectará automáticamente el proyecto Maven

### 3. Verificar la configuración del JDK

1. Ve a `File` → `Project Structure`
2. En `Project`, verifica que el SDK sea Java 17
3. Click en `OK`

---

## ▶️ Ejecución

### Ejecutar los tests

```bash
mvn test
```

O desde IntelliJ:

1. Haz clic derecho sobre la carpeta `src/test/java`
2. Selecciona `Run 'All Tests'`

---

## 🧪 Tests Implementados

### Ejercicio 1 - NoGenericMethodsTest

1. `testConstructorStoresValues` - Verifica que el constructor almacena los valores y los setters los actualizan
2. `testConstructorRejectsNull` - Verifica que se lanza excepción con argumentos nulos

### Ejercicio 2 - GenericMethodsTest

1. `testWithPersonaStringDouble` - Verifica que acepta Person, String y Double
2. `testWithDifferentTypes` - Verifica que acepta String, Integer y Boolean

---

## 📁 Estructura del Proyecto

```
1.6-Java_language_nivell1/
├── pom.xml
├── README.md
└── src/
    ├── main/java/
    │   ├── exercici1/
    │   │   └── NoGenericMethods.java
    │   └── exercici2/
    │       ├── Person.java
    │       └── GenericMethods.java
    └── test/java/
        ├── exercici1/
        │   └── NoGenericMethodsTest.java
        └── exercici2/
            └── GenericMethodsTest.java
```

---

## 🌐 Despliegue

Este proyecto es una aplicación de consola local y no requiere despliegue en un servidor. Está diseñado para ejecutarse en un entorno local con fines educativos.

---

## 🤝 Contribuciones

Este es un proyecto educativo personal desarrollado como parte del bootcamp de **IT Academy - Barcelona Activa**.
