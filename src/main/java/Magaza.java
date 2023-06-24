import java.util.Scanner;

public class Magaza {
    public void giris(){
        System.out.println("---LPG Satış Mağazasına Hoşgeldiniz---");
        int cikis = 1;
        while (cikis != 0){
            System.out.print(
                    "\nÜrünlerimiz" +
                    "\n1-> LPG Montaj Kitleri" +
                    "\n2-> LPG Tank" +
                    "\n3-> LPG Montaj Malzemeleri" +
                    "\n0-> Çıkış" +
                    "\n Ürün seçin: " );
            Scanner scan = new Scanner(System.in);
            int secim = scan.nextInt();

            switch (secim){
                case 1:
                    System.out.print("Montaj Sistemleri " +
                            "\n1-> Sıralı Sistem" +
                            "\n2-> Karbüratörlü Sistem" +
                            "\n Kit sistemini seçin: ");
                    int sistemNo = scan.nextInt();

                    LPG_Montaj_Kit lpgMontajKit = new LPG_Montaj_Kit();
                    lpgMontajKit.montajKitMarkası(sistemNo);
                    lpgMontajKit.bilgiler();
                    break;

                case 2:
                    System.out.print("Tank Tipleri " +
                            "\n1-> Silindir " +
                            "\n2-> Simit " +
                            "\n Tank tipini seçin: ");
                    int tipNo = scan.nextInt();
                    LPG_Tank lpgTank = new LPG_Tank();
                    lpgTank.tankMarkası(tipNo);
                    lpgTank.bilgiler();
                    break;

                case 3:
                    LPG_Montaj_Malzemeleri lpgMontajMalzemeleri = new LPG_Montaj_Malzemeleri();
                    lpgMontajMalzemeleri.malzemeler();
                    lpgMontajMalzemeleri.bilgiler();
                    break;

                case 0:
                    cikis = 0;
                    System.out.println("Çıkış yapılıyor");
                    break;
            }
        }

    }

}
