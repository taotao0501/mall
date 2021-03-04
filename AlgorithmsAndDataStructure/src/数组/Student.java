package 数组;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(){};

    public Student(String name, int score) {
        this.name = name;
        this.score =score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object student) {
        if(this == student)
            return true;
        if(student == null)
            return false;
        if(this.getClass() != student.getClass())
            return false;

        Student another = (Student)student;
        return this.name.equals(another.name);
    }

    @Override
    public int compareTo(Student another) {
        return this.score - another.score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {

        Array<Student> studentArray = new Array<>();
        studentArray.addLast(new Student("Mary", 88));
        studentArray.addLast(new Student("Jack", 99));
        studentArray.addLast(new Student("Rose", 90));
        System.out.println(studentArray);
    }
}
