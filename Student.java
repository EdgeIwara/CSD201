public class Student {

    String name;
    int age;

    Student() {
    }

    Student(String xName, int xAge) {
        name = xName;
        age = xAge;
    }

    public String tostring() {
        return (" ( " + name + "," + age + " ) ");
    }

}

