public class Student
{
    public string Name { get; set; }
    public int Age { get; set; }
    public double Average { get; set; }

    public Student(string name, int age, double average)
    {
        this.name = name;
        this.age = age;
        this.average = average;
    }
    public void ShowInfo()
    {
     Console.WriteLine($"{name} | Age: {age} | Average: {average}");
    }

    public void SetAverage(double newAverage)
    {
     this.average = newAverage;
    }
}