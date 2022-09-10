import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {

    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    hgs hgs1 = new hgs(1111,"batuhan","sener",(char) 1,50);
    gise gise1 = new gise();

    int sec;
    Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1)Odeme Islemi \n2)Gunluk Hasilat");
                sec = scan.nextInt();
                switch (sec) {
                    case 1:
                        hgs1.bakiye = gise1.odeme(hgs1.arac_sinifi,hgs1.bakiye,hgs1.hgs_no);
                        hgs1.tarih = date.toString();
                        hgs1.saat = time.toString();
                        System.out.println("Guncel bakiye: "+hgs1.bakiye+"\n");
                        break;
                    case 2:
                        System.out.println("Gunluk toplam Hasilat: "+yonetim.raporlo()+"\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid User Input. Please enter a value from 0 to 4.");
            }
        }
    }

}


