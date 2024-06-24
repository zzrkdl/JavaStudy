package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="덕배";
        student1.age=18;
        student1.grade=90;

        Student student2 = new Student();
        student2.name ="엘링홀란";
        student2.age=15;
        student2.grade=80;


        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for(int i = 0; i<students.length; i++){
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age+ " 점수 : " +students[i].grade);

        }
    }
}
