namespace DefaultNamespace;

public class Student
{
    public string Name { get; set; }
    public int Age { get; set; }
    public double Average { get; set; }

    public Student(string name, int age, double average)
    {
        this.Name = name;
        this.Age = age;
        this.Average = average;
    }
    
    public void ShowInfo()
    {
        Console.WriteLine($"[Class]  {Name} | Age: {Age} | Average: {Average}");
    }

    public void SetAverage(double newAverage)
    {
        this.Average = newAverage;
    }
}