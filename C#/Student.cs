public struct Student 
{
    public string Name { get; set; }
    public int Age { get; set; }
    public double Average { get; set; }

    public Student(string name, int age, double average)
    {
        Name = name;
        Age = age;
        Average = average;
    }
    public override string ToString() => $"Student {{ Name = {Name}, Age = {Age}, Average = {Average} }}";
}