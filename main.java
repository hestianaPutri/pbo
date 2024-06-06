package week9;

import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih opsi:");
        System.out.println("1. Hitung luas persegi");
        System.out.println("2. Hitung luas persegi panjang");
        System.out.println("3. Hitung luas segitiga");
        System.out.println("4. Hitung luas lingkaran");
        System.out.println("5. Hitung volume kubus");
        System.out.println("6. Hitung volume balok");
        System.out.println("7. Hitung volume tabung");
        System.out.println("8. Masukan Pilihan:");
    

        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                // Kasus 1: Luas persegi
                System.out.print("Masukkan panjang sisi persegi: ");
                int sisi = scanner.nextInt();
                BangunDatar persegi = new BangunDatar(sisi);
                int luasPersegi = persegi.luas(sisi);
                System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luasPersegi);
                break;
            case 2:
                // Kasus 2: Luas persegi panjang
                System.out.print("Masukkan panjang persegi panjang: ");
                int panjang = scanner.nextInt();
                System.out.print("Masukkan lebar persegi panjang: ");
                int lebar = scanner.nextInt();
                BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                int luasPersegiPanjang = persegiPanjang.luas(panjang, lebar);
                System.out.println("Luas persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah: " + luasPersegiPanjang);
                break;
            case 3:
                // Kasus 3: Luas segitiga
                System.out.print("Masukkan alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = scanner.nextDouble();
                BangunDatar segitiga = new BangunDatar(0); // Dummy object for calling luas method
                double luasSegitiga = segitiga.luas(alas, tinggiSegitiga);
                System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggiSegitiga + " adalah: " + luasSegitiga);
                break;
            case 4:
                // Kasus 4: Luas lingkaran
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJariLingkaran = scanner.nextDouble();
                BangunDatar lingkaran = new BangunDatar(0); // Dummy object for calling luas method
                double luasLingkaran = lingkaran.luas(jariJariLingkaran);
                System.out.println("Luas lingkaran dengan jari-jari " + jariJariLingkaran + " adalah: " + luasLingkaran);
                break;
            case 5:
                // Kasus 5: Volume kubus
                System.out.print("Masukkan panjang sisi kubus: ");
                int sisiKubus = scanner.nextInt();
                BangunRuang kubus = new BangunRuang(sisiKubus, 0); // tinggi tidak digunakan untuk kubus
                double volumeKubus = kubus.volumeKubus();
                System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volumeKubus);
                break;
            case 6:
                // Kasus 6: Volume balok
                System.out.print("Masukkan panjang balok: ");
                int panjangBalok = scanner.nextInt();
                System.out.print("Masukkan lebar balok: ");
                int lebarBalok = scanner.nextInt();
                System.out.print("Masukkan tinggi balok: ");
                int tinggiBalok = scanner.nextInt();
                BangunRuang balok = new BangunRuang(panjangBalok, lebarBalok, tinggiBalok);
                double volumeBalok = balok.volumeBalok();
                System.out.println("Volume balok dengan panjang " + panjangBalok + ", lebar " + lebarBalok + ", dan tinggi " + tinggiBalok + " adalah: " + volumeBalok);
                break;
            case 7:
                // Kasus 7: Volume tabung
                System.out.print("Masukkan diameter tabung: ");
                int diameterTabung = scanner.nextInt();
                System.out.print("Masukkan tinggi tabung: ");
                int tinggiTabung = scanner.nextInt();
                BangunRuang tabung = new BangunRuang(0, tinggiTabung); // sisi tidak digunakan untuk tabung
                tabung.setDiameter(diameterTabung);
                double volumeTabung = tabung.volumeTabung();
                System.out.println("Volume tabung dengan diameter " + diameterTabung + " dan tinggi " + tinggiTabung + " adalah: " + volumeTabung);
                break;
            case 8:
                // Keluar
                System.out.println("Keluar dari program.");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        scanner.close();
    }
}
