public class SortingOnBasis {

    // Sample array of objects

    String name;
    int marks;

    public SortingOnBasis(String name, int marks) {
    this.name = name;
    this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + marks +
                '}';
    }
}
