package static2;


import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();



        System.out.println("2. 인스턴스 호출1");
        DecoData data = new DecoData();
        data.instanceCall();


        System.out.println("3. 인스턴스 호출2");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        staticCall();
    }
}
