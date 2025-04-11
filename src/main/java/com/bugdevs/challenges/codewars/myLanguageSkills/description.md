# [Codewars] My Language Skills
https://www.codewars.com/kata/5b16490986b6d336c900007d

## Descripción del problema

Se te proporciona un objeto similar a un diccionario (la implementación puede variar según el lenguaje de programación), que contiene idiomas como claves y tus resultados de prueba correspondientes como valores.
Devuelve la **lista de idiomas en los que tu puntuación es al menos 60**, ordenada en orden **descendente** según las puntuaciones.

> Nota: Las puntuaciones **siempre serán únicas** (es decir, no habrá valores duplicados).

---

## Ejemplos

### Ejemplo 1
**Entrada:**

```json
{
  "Java": 10,
  "Ruby": 80,
  "Python": 65
}
```

**Salida esperada:**

```json
["Ruby", "Python"]
```

---

### Ejemplo 2
**Entrada:**

```json
{
  "Hindi": 60,
  "Greek": 71,
  "Dutch": 93
}
```

**Salida esperada:**

```json
["Dutch", "Greek", "Hindi"]
```

---

### Ejemplo 3
**Entrada:**

```json
{
  "C++": 50,
  "ASM": 10,
  "Haskell": 20
}
```

**Salida esperada:**

```json
[]
```