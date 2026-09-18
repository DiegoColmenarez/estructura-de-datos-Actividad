namespace DefaultNamespace;

public struct StudentStruct
{
    public string Name { get; set; }
    public int Age { get; set; }
    public double Average { get; set; }

    public StudentStruct(string name, int age, double average)
    {
        Name = name;
        Age = age;
        Average = average;
    }
    
    public void ShowInfo()
    {
        Console.WriteLine($"[Struct] {Name} | Age: {Age} | Average: {Average}");
    }
}