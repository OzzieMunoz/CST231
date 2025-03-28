package wk10;

public class TraceMethod {
    public static void main(String [] args){
        int x = 1, y = 2;
        foo(x, x);
        System.out.println(bar(x, y, x));
        x = bar(y, y, x);
        y = bar(x, y, bar(y, y, y));
        int z = x - y;
        foo(x, y);
        foo(bar(x, x, x), bar(y, y, y));
    }
    public static void foo(int y, int z){
        int x = 5;
        x = x + 1;
        y = y + 1;
        z = z + 1;
        System.out.println(x + y + z);
    }
    public static int bar(int x, int y, int z) {
        int temp = x;
        x = y + z;
        y = x * z;
        z = z + 5;
        return z;
    }
}
