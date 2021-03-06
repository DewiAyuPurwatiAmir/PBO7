//program interface


import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        
        // membuat objek HP
        Lampu blackMoon = new moonLamp();

        // membuat objek user
        User dewi = new User(blackMoon);

        // kita coba nyalakan HP-nya
        dewi.turnOnTheLamp();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("*** APLIKASI INTERFACE ***");
            System.out.println("[1] Nyalakan Lampu");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Mode Membaca");
            System.out.println("[4] Mode Tidur");
            System.out.println("[0] Keluar");
            System.out.println("***************************");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dewi.turnOnTheLamp();
            } else if (aksi.equalsIgnoreCase("2")){
                dewi.turnOffTheLamp();
            } else if (aksi.equalsIgnoreCase("3")){
                dewi.makeLampReadMode();
            } else if (aksi.equalsIgnoreCase("4")){
                dewi.makeLampSleepMode();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih pilihan yang salah!");
            }
        }

    }

}

