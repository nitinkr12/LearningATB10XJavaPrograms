package ex_23Feb;

public class Students {
    private String name;
    private int age;

    Students(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void print_details()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

