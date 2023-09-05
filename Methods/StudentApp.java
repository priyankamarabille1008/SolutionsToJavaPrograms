package Methods;
class Student {
    String name;
    int rollnum;
    String branch;
    int yop;
    float cgpa;

    public void giveintro() {
        System.out.println("name= " + name);
        System.out.println("rollnumber= " + rollnum);
        System.out.println("branch= " + branch);
        System.out.println("year of passing= " + yop);
        System.out.println("cgpa= " + cgpa);
    }
}
    class StudentApp{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Priyaka";
        s1.rollnum = 123;
        s1.branch = "MCA";
        s1.yop = 2023;
        s1.cgpa = 7.5f;
        s1.giveintro();

        Student s2 = new Student();
        s2.name = "Priyaka";
        s2.rollnum = 123;
        s2.branch = "MCA";
        s2.yop = 2023;
        s2.cgpa = 7.5f;
        s2.giveintro();
    }
}