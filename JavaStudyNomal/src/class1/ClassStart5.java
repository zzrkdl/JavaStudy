package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="덕배";
        student1.age=18;
        student1.grade=90;

        Student student2 = new Student();
        student2.name ="엘링홀란";
        student2.age=15;
        student2.grade=80;


        Student[] students = {student1,student2};

        for(int i = 0; i<students.length; i++){
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age+ " 점수 : " +students[i].grade);
        }

        for(int i = 0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름 : " + s.name + " 나이 : " + s.age+ " 점수 : " +s.grade);
        }
        //forEach문으로 하는게 편함 값 하나를 가지고 루프 돌릴 때
        for(Student s : students){
            System.out.println("이름 : " + s.name + " 나이 : " + s.age+ " 점수 : " +s.grade);
        }
    }
}
