package static2;

public class DecoData {

    private int instanceValue;
    private static int stativValue;


    public static void staticCall(){
        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        stativValue++; //정적 변수의 접근
        staticMethod(); //정적 메서드의 접근
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근, compile error
        instanceMethod(); //인스턴스 메서드 접근, compile error

        stativValue++; //정적 변수의 접근
        staticMethod(); //정적 메서드의 접근
    }

    //인스턴스 값을 매개변수로 받아와서 사용하기때문에 컴파일 에러가 안뜨고 사용 가능
    public static void staticCall(DecoData data){
        data.instanceCall();
        data.instanceMethod();
    }


    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("stativValue = " + stativValue);
    }
}
