from dataclasses import dataclass

@dataclass
class Estudiante:
    nombre: str
    edad: int
    promedio: float

estudiantes = [
    Estudiante("Ana", 20, 4.2),
    Estudiante("Juan", 22, 3.8),
    Estudiante("Carlos", 21, 4.5)
]


print("--- Datos Iniciales ---")
for e in estudiantes:
    print(f"{e.nombre} | Edad: {e.edad} | Promedio: {e.promedio}")


estudiantes[1].promedio = 4.6

print("\n--- Después de modificar a Juan ---")
print(f"{estudiantes[1].nombre} | Nuevo Promedio: {estudiantes[1].promedio}")