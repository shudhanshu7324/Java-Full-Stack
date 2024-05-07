public class TypeCasting_3 {
    public static void main(String[] args) {
        // type conversion
        byte z = 32;
        int m = z;
        // byte can automatically be stored in integer because integer range is greater than byte range but integer cannot be stored in byte because byte size is smaller than integer so here the concept comes of type casting.


        // type casting
        byte x = 32;
        int a = 298;
        byte y = (byte)a;

        // type promotion
        // byte*byte can be get overflowed from byte range so automatically type promotion takes place
        byte f = 10;
        byte b = 30;
        int c = a*b;
        System.out.println(c);
    }
}
