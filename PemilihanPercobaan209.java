import java.util.Scanner;
public class PemilihanPercobaan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = input09.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input09.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input09.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input09.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        double nilaiSetara;
        String nilaiHuruf, kualifikasi;

        if (total >80 && total <= 100) {
        nilaiHuruf = "A";
        nilaiSetara = 4;
        kualifikasi = " Sangat Baik ";
        System.out.println(nilaiHuruf);
        System.out.println(nilaiSetara);
        System.out.println(kualifikasi);
        } else if (total >73 && total <= 80) {
        nilaiHuruf = "B+";
        nilaiSetara = 3.5;
        kualifikasi = " Lebih Dari Baik ";
        System.out.println(nilaiHuruf);
        System.out.println(nilaiSetara);
        System.out.println(kualifikasi);        
        } else if (total >65 && total <= 73) {
        nilaiHuruf = "B";
        nilaiSetara = 3;
        kualifikasi = " Baik ";
        System.out.println(nilaiHuruf);
        System.out.println(nilaiSetara);
        System.out.println(kualifikasi);
        } 
        else if (total >60 && total <= 65) {
        nilaiHuruf = "C+";
        nilaiSetara = 2.5;
        kualifikasi = " Lebih dari Cukup ";
        System.out.println(nilaiHuruf);
        System.out.println(nilaiSetara);
        System.out.println(kualifikasi);
        } else if (total >50 && total <= 60) {
        nilaiHuruf = "C";
        nilaiSetara = 2;
        kualifikasi = " Cukup ";
        System.out.println(nilaiHuruf);
        System.out.println(nilaiSetara);
        System.out.println(kualifikasi);
        } else if (total >39 && total <= 50) {
        nilaiHuruf = "D";
        nilaiSetara = 1;
        kualifikasi = " Kurang ";
        System.out.println(nilaiHuruf);
        System.out.println(nilaiSetara);
        System.out.println(kualifikasi);
        }
         else if (total <= 39) {
        nilaiHuruf = "E";
        nilaiSetara = 0;
        kualifikasi = " Gagal ";
        System.out.println(nilaiHuruf);
        System.out.println(nilaiSetara);
        System.out.println(kualifikasi);
        }
    }
}
    

