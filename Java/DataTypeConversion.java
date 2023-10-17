public class DataTypeConversion {
    public static void main(String[] args){
        // 數字型態間的轉換
        // 數字型態範圍大小的排序 : double > flost > long > int > short > byte
        // 小範圍轉大範圍 : 自動轉換

        // byte x = 3;
        // int y = x;
        // System.out.println(y);
        // long z = y;
        // System.out.println(z);
        // double d = z;
        // System.out.println(d);

        // 大範圍轉小範圍 : 需要使用 (資料型態) 做強制轉換

        // int x = 1024;
        // byte y = (byte)x; // 錯誤 : 試圖把 int 轉換成 byte
        // System.out.println(y);
        // long z = 102400;
        // int m = (int)z; // 錯誤 : 試圖把 long 轉換成 int
        // System.out.println(m);

        // float f = (float)3.141592689; // 錯誤 : 試圖把 double 轉成 float 
        // System.out.println(f);

        // 字串轉換成數字

        // String text = "34";
        // int x = Integer.parseInt(text);
        // System.out.println(x);

        // text = "3.1415";
        // double d = Double.parseDouble(text);
        // System.out.println(d);

        // 數字轉換成字串

        // int x = 34;
        // String s = String.valueOf(x); // 把 int 型態的 34 轉換成 String 型態的 "34"
        // System.out.println(s);
        // long y = 9999999;
        // s=String.valueOf(y);
        // System.out.println(s);

        // s = String.valueOf(3.14159F);
        // System.out.println(s);
    }
}
