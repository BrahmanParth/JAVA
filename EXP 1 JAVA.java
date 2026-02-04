class Student {
    String name;
    int rollNo;
    int marks;

    Student() {
        name = "Not Assigned";
        rollNo = 0;
        marks = 0;
    }

    Student(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aryan", 102, 85);

        s1.display();
        s2.display();
    }
}