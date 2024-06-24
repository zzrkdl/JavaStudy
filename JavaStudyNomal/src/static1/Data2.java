package static1;

public class Data2 {
    public String name;

    public Data2(String name, Count count){
        this.name = name;
        count.count++;
    }
}
