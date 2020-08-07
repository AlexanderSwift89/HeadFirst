public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        //j = i; //присвоение дает ошибку
        System.out.println(j);
        System.out.println(i);
    }
}
