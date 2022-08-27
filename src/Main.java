public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] intarr = new int[]{1, 2, 3};
        double[] dblarr = {1.57, 7.654, 9.986};
        boolean[] boolarr = new boolean[]{true, true, false};

        //Задание 2
        for (int i = 0; i < intarr.length; i++) {
            System.out.print(intarr[i]);
            if (i != intarr.length - 1) System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < dblarr.length; i++) {
            System.out.print(dblarr[i]);
            if (i != dblarr.length - 1) System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < boolarr.length; i++) {
            System.out.print(boolarr[i]);
            if (i != boolarr.length - 1) System.out.print(", ");
        }
        System.out.println();

        //Задание 3
        for (int i = intarr.length - 1; i > -1; i--) {
            System.out.print(intarr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i = dblarr.length - 1; i > -1; i--) {
            System.out.print(dblarr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i = boolarr.length - 1; i > -1; i--) {
            System.out.print(boolarr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();

        //Задание 4
        for (int i = 0; i < intarr.length; i++) {
            if (intarr[i] % 2 != 0) intarr[i]++;
        }
        for (int i = 0; i < intarr.length; i++) {
            System.out.print(intarr[i]);
            if (i != intarr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
