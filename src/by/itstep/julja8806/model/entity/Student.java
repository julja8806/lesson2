package by.itstep.julja8806.model.entity;

public class Student {
    private Student name;
    private int age;

    public Student() {
    }

    public Student(Student name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(Student name) {
        this.name = name;
    }

    public void setAge(int age) throws Exception {
        if (age > 0) {
            this.age = age;
        }else {
            throw new Exception();
        }
    }
}
