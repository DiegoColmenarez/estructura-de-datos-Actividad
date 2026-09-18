class Student:
    def __init__(self, name, age, average):
        self.name = name
        self.age = age
        self.average = average

    def show_info(self):
        print(f"{self.name} | Age: {self.age} | Average: {self.average}")

    def set_average(self, new_average):
        self.average = new_average


students = [
    Student("Alice", 20, 4.2),
    Student("John", 22, 3.8),
    Student("Charlie", 21, 4.5)
]

print("--- Initial Information ---")
for s in students:
    s.show_info()


students[1].set_average(4.6)

print("\n--- After modifying John ---")
students[1].show_info()