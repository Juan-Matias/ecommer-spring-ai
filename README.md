# 🌱 Ecomart

Ecomart es una aplicación Java/Spring Boot que integra inteligencia artificial para generar productos ecológicos de manera automática utilizando la API de OpenAI.

## 🚀 Tecnologías utilizadas

- **Java 17+**
- **Spring Boot** 3.x
- **Spring AI** (cliente de OpenAI)
- **Maven**
- **REST API**
- **OpenAI API**

---

## 📂 Estructura del proyecto

```bash
D:.
├───main
│   ├───java
│   │   └───com
│   │       └───example
│   │           └───ecomart
│   │               │   EcomartApplication.java
│   │               │
│   │               └───Controller
│   │                       GeneradorDeProductosController.java
│   │
│   └───resources
│       │   application.properties
│       │
│       ├───static
│       └───templates
└───test
```
---
## ⚙️ Configuración

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/ecomart.git
   cd ecomart

---
## Configurar la API Key de OpenAI

```bash
spring.ai.openai.api-key=TU_API_KEY_AQUI

