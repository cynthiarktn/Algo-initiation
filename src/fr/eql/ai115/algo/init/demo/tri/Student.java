package fr.eql.ai115.algo.init.demo.tri;

public class Student implements Comparable<Student>{
    private int id;
    private int age;
    private String nom;

    public Student() {}

    public Student(int id, int age, String nom) {
        if (id == 0 || nom == null || age == 0) throw new RuntimeException("Invalid data.");
        // on va mettre une exception si les arguments ne contiennent aucune donnée
        this.id = id;
        this.age = age;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                '}';
    }

    // on choisi le critère de tri, ici on a choisi l'âge
    // grâce à l'interface Comparable à la classe Student on ne peut avoir qu'un seul critère de tri
    // ils sont au niveau -1 pour dire avant 0 identique et 1 pour après
    @Override
    public int compareTo(Student o) {
        if (age==o.getAge()) return 0; // l'âge est identique.
        else if (age > o.getAge()) return 1; //plus grand
        else return -1; // plus petit
    }
}
