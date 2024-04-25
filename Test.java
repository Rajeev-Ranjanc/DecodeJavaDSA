class First {
    final int a;

    First() {
        a = 10;
    }

    int b;


    public void display() {
        System.out.println("I'm in parent class");
    }


}

class Second extends First {
    int c;

    public void display() {
        System.out.println("I'm in child class");
    }
}

class Person {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}

// Driver Class

public class Test {

    public static void main(String[] args) {

      Person p = new Person();
      p.setAge(22);
      p.setName("Priya Yadav");


        System.out.print(p.getName());
        System.out.println(" "+p.getAge());
    }
}