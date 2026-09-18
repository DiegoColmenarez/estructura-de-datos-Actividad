namespace DefaultNamespace;

class Program
{
    static void Main()
    {
        Console.WriteLine("=== TEST CON STRUCT ===");
   
        StudentStruct[] structStudents = [
            new("Alice", 20, 4.2),
            new("John", 22, 3.8),
            new("Charlie", 21, 4.5)
        ];

        foreach (var s in structStudents) s.ShowInfo();

        structStudents[1].Average = 4.6;

        Console.WriteLine("\n--- Después de modificar a John (Struct) ---");
        structStudents[1].ShowInfo();

        Console.WriteLine("\n\n=== TEST CON CLASS ===");

        Student[] classStudents = [
            new("Alice", 20, 4.2),
            new("John", 22, 3.8),
            new("Charlie", 21, 4.5)
        ];

        foreach (var s in classStudents) s.ShowInfo();

        classStudents[1].SetAverage(4.6);

        Console.WriteLine("\n--- Después de modificar a John (Class) ---");
        classStudents[1].ShowInfo();
    }
}