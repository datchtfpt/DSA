package com.fudn.Generic.Demo_Generic;

public class TinhTrungBinhCong {

    public static <T> double tinhTBC(T[] mang){
        double sum = 0;

        for(int i = 0; i < mang.length; i++){
            double value = Double.valueOf(mang[i].toString());
            sum += value;
        }
        return sum/ mang.length;
    }

    public static void main(String[] args) {
        Integer[] mang = {5,10,15};
        System.out.println("TBC-int:" + tinhTBC(mang));

        Float[] mangf = {1.5f, 3.4f, 6.3f};
        System.out.println("TBC-float:" + tinhTBC(mangf));

        Float[] mangf2 = {5f, 10f, 15f};
        System.out.println("TBC-float:" + tinhTBC(mangf2));
    }
}
