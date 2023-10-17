public class DataTypeVariable{
    public static void main(String[] args){
        // 在終端機印出各種資料型態的資料
        // 整數。預設是 int 的型態
        int x = 3;
        System.out.println(x);
        int x2 = 120;
        System.out.println(x2);
        // 長整數。數字的後面加上 L
        long y = 1000000000000000L;
        System.out.println(y);
        // 浮點數，預設是 double
        double y2 = 3.1415926;
        System.out.println(y2);
        // 單精度浮點數，數字的後面特別加上 F
        float m = 3.14159268F;
        System.out.println(m);
        // 布林值
        boolean b = true;
        System.out.println(b);
        // 字元
        char c = 'L';
        System.out.println(c);
        // 字串
        String s = "我是 Java 新手";
        System.out.println(s);
    }
}