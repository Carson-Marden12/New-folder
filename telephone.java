public class telephone {

    public static void main(String[] args) {
        int j = 103;
        j = addNum(j);
        j = subtractNum(j);
        j = evilkillsyou(j);


        
        System.out.println(j);
    }

    public static int addNum(int a) {
        return a + 1;
    }

    public static int subtractNum(int dividend) {
        return (dividend - 100);
    }

    public static int multNum(int m){
        return (m * 2);
    }
    public static int evilkillsyou(int d){
        return d/100;
    }
}
