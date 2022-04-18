import java.util.Scanner;

public class Facbook {
    
    private static void PrintTitle(){
        System.out.println("--------------------");
        System.out.println("   HHHHHH    HHHHH  ");
        System.out.println("   HH        hh  hh ");
        System.out.println("   HHHHHH    hh hh  ");
        System.out.println("   HH        hh  hh ");
        System.out.println("   HH        HHHHH  ");
        System.out.println("                    ");
        System.out.println("   Selamat Datang   ");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        String Nama;
        String email;
        String pin;

        Nama = "Eman";
        email = "Prasojoeman@gmail.com";

        Scanner inputUser = new Scanner (System.in);
        PrintTitle();
        System.out.println("Masukkan Email     ");
        System.out.println("Masukkan KataSandi");
        pin = inputUser.nextLine();
        if (pin.equals("123456")){
            Facebook2 Eman = new Facebook2(Nama, email);
            char pilihan = 0;
            do {
                PrintTitle();
                System.out.println();
                System.out.println("MENU");
                System.out.println("[1]. Like");
                System.out.println("[2]. Share");
                System.out.println("[0]. Exit");
                System.out.println("Pilihan Anda   :");
                pilihan = inputUser.next().charAt(0);
                System.out.println();
                switch (pilihan) {
                    case '1' -> {
                        int jumlahlike;
                        jumlahlike = 1;
                        int jumlahakhirlike = Eman.Suka(jumlahlike);
                        System.out.println("Like : " + jumlahakhirlike);
                    }
                    case '2' -> {
                        int jumlahshare = 1;
                        int jumlahakhirshare = Eman.Bagi(jumlahshare);
                        System.out.println("Share : " + jumlahakhirshare);
                    }
                    default -> {
                    }
                }
            }while (pilihan!='0');
        }
    }

}