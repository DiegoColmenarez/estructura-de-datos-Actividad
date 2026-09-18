from dataclasses import dataclass

@dataclass
class Student:
    name: str
    age: int
    average: float

students = [
    Student("Ana", 20, 4.2),
    Student("Juan", 22, 3.8),
    Student("Carlos", 21, 4.5)
]


print("--- Datos Iniciales ---")
for e in students:
    print(f"{e.name} | Age: {e.age} | Average: {e.average}")


students[1].average = 4.6

print("\n--- Después de modificar a Juan ---")
print(f"{students[1].name} | Nuevo Promedio: {students[1].average}")