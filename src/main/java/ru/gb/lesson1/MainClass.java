package ru.gb.lesson1;


public class MainClass {


    byte byteB = 0b00;  // 1 байт, -128 - 127
    short z; // 2 байта, -32768 - 32767
    int i = 2_147_000_000; // 4 байта -2147... - 2147...
    long l = 4_147_000_000L; // 8 байт
    float f = 2147.0f;
    double d = 2134.123;
    char ch = 'A'; // 2 байта ASCII
    boolean bool = true; // true / false
    String str = "Java";
    String str1 = new String("1");


    private static void hello() {
        System.out.println("Hello world!!");
    }

    private static void helloHuman(String name, String surname) {
        System.out.println("Hello, " + surname + " " + name);
    }

    private static void helloHuman(String name) {
        if (name == "asdasd") {
            return; // exit
        }
        System.out.println("Hello, " + name);
    }

    private static void helloHuman(int name) {
        System.out.println("Hello, " + name);
    }

    private static int calc(int x, int y) {
        return x + y;
    }




    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int result = calc(x, y);
    }


    private static void intro() {
        int x = 10;


        x = x + 10;
        x += 10;

        int fieldSize = 3;
        int userFieldInput = 4;

        // &&
        int y = 10;
        System.out.println(y);
        y++;
        if (fieldSize != userFieldInput || y > 0 ) {
            System.out.println(y);
        }


        if (fieldSize < userFieldInput || userFieldInput < 0 ) {
            System.out.println("incorrect value");
        } else {
            System.out.println("everything ok");
        }


        if (fieldSize < userFieldInput) {
            System.out.println("incorrect value");
        } else if (userFieldInput < 0) {
            System.out.println("incorrect value");
        } else {
            System.out.println("everything ok");
        }


        if (3 < 5) {
            System.out.println("incorrect value");
        }

        if (false) {
            System.out.println("incorrect value");
        }


        System.out.print(++y);
        System.out.print(y++);
        System.out.print(y);
    }

}
