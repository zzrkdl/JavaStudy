package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Count count = new Count();

        Data2 data1= new Data2("A",count);
        System.out.println("A count=" +count.count);

        Data2 data2= new Data2("B",count);
        System.out.println("B count=" +count.count);

        Data2 data3= new Data2("C",count);
        System.out.println("C count=" +count.count);
    }
}
