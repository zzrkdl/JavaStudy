package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 18, 80);

         MemberInit[] members = {member1, member2};

        for(MemberInit m : members){
            System.out.println("이름: " + m.name + "나이: " + m.age+ "점수: " + m.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

