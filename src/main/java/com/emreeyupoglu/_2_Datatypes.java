package com.emreeyupoglu;

public class _2_Datatypes {

    public static void main(String[] args) {
        // Variable
        // Tam sayılar
        byte b1 = 25;
        System.out.println(b1);
        short s1 = 125;
        int i1 = 45545;
        long l1 = 575135752354564L;

        // virgüllü sayılar
        float f2 = 14.53f;
        double d2 = 12121212.5454684;

        char c3 = '2';
        boolean b3 = 3 > 1;
        System.out.println(b3);

        // primitive type - Wrapper type

        int primitive = 44;
        // verilemez => primitive = null;
        Integer objectInt = 44;
        objectInt = null;
    }
}
