package ru.netology.sqr;

public class SQRservice {

    public int calculate (int squareNumber) {
        for (int a = 10; a <= squareNumber; a++) {
            if (a * a >= squareNumber) {
                return a;
            }
        }
        return 0;
    }


}
