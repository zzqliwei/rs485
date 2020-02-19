package com.westar;

public class Test {
    public static void main(String[] args) {
        int   a   = 0x15;
        System.out.println(a);

//        int ADDR = 0x18 ;
//        int CMD1 =0x41 ;
//        int CMD2 = 0x00 ;
//        int DATA1 = 0x01 ;
//        int DATA2 = 0x00 ;
//        int DATA3= 0x00 ;
//        int DATA4 = 0x00 ;
//        int DATA5 = 0x00;
//        //88

        int ADDR = (byte)0x18 ;
        int CMD1 =(byte)0x41 ;
        int CMD2 = (byte)0x00 ;
        int DATA1 = (byte)0x00 ;
        int DATA2 = (byte)0x00 ;
        int DATA3= (byte)0x00 ;
        int DATA4 = (byte)0x00 ;
        int DATA5 = (byte)0x00;
        //89

        int CHK = ADDR^CMD1^CMD2^DATA1^DATA2^DATA3^DATA4^DATA5;
        System.out.println(CHK);





    }
}
