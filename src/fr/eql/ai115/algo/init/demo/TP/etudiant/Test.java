package fr.eql.ai115.algo.init.demo.TP.etudiant;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();

        Student student = new Student();
        student.sayHello();
        student.setAge(15);
        student.goToClasses();
        student.displayAge();

        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.sayHello();
        teacher.explain();
    }
}
