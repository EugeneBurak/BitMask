public class Main {

    public static void main(String[] args) {
        int a = 9;
        System.out.println(Integer.toBinaryString(a) + " "+ a);

        a |= (1<<2); // установить в 1 бит 2
        System.out.println(Integer.toBinaryString(a) + " "+ a);

        int b = 15;
        System.out.println(Integer.toBinaryString(b) + " "+ b);

        b &= ~(1<<2); // установить в 0 бит 2
        System.out.println(Integer.toBinaryString(b) + " "+ b);

        int c = b & (1<<2); // узнаем про 2 бит
        int d = b & (1<<3); // узнаем про 3 бит
        System.out.println(Integer.toBinaryString(b) + " "+ b + " " + c +" "+ d);
    }
}
