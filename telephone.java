public class telephone {

    public static void main(String[] args) {
        int j = 10;
        j = addNum(j);
        j = subtractNum(j);



        
        System.out.println(j);
    }

    public static int addNum(int a) {
        return a + 1;
    }

    public static int subtractNum(int dividend) {
        return (dividend - 100);
    }
}
