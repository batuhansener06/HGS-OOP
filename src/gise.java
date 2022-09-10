public class gise {

    static double bakiye_gise;

    class_1 arac1 = new class_1(15,"otomobil");
    class_2 arac2 = new class_2(25,"minubus");
    class_3 arac3 = new class_3(50,"otobus");

    int gunluk[]= new int[500];
    static int aracsayisi;

    double odeme(char arac_sinifi, double bakiye, int hgs_no){

        // En düşük ücret her zaman 1. araçlar için olduğu için yalnızca onun sorgulaması yapıldı.
        if (bakiye<arac1.ucret){
            System.out.println("bakiye yetersiz");
        }

        else{
        if (arac_sinifi==1){
            bakiye -= arac1.ucret;
            bakiye_gise += arac1.ucret;
        }if (arac_sinifi==2){
            bakiye -= arac2.ucret;
            bakiye_gise += arac1.ucret;
        }if (arac_sinifi==3){
            bakiye -= arac3.ucret;
            bakiye_gise += arac1.ucret;
        }
        gunluk[aracsayisi] = hgs_no;
        aracsayisi++;
        System.out.println("Ucret alinmistir");
        }

        return bakiye;
    }
}
