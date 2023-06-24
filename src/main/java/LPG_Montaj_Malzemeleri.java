import java.util.Scanner;

public class LPG_Montaj_Malzemeleri {
    String isim;
    int fiyat;

    public LPG_Montaj_Malzemeleri() {
    }

    public LPG_Montaj_Malzemeleri(String isim, int fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    Scanner scan = new Scanner(System.in);
    public void malzemeler(){
        System.out.print("Malzemeler " +
                "\n1-> Bakır Boru" +
                "\n2-> Kombine anahtar" +
                "\n0-> Geri git" +
                "\n ürün seçin: ");
        int secim = scan.nextInt();
        switch (secim){
            case 1:
                System.out.print("100 metre Bakır boru fiyatları" +
                        "\n1-> 6mm bakır boru  300 TL" +
                        "\n2-> 8mm bakır boru  500 TL" +
                        "\n ürün seçin: ");
                int boruSecim = scan.nextInt();
                if (boruSecim == 1){
                    Bakır_Boru bakırBoru = new Bakır_Boru("6mm boru", 300);
                    edit(bakırBoru);
                } else if (boruSecim == 2) {
                    Bakır_Boru bakırBoru = new Bakır_Boru("8mm boru", 500);
                    edit(bakırBoru);
                }else {
                    System.out.println("Hatalı giriş yaptınız");
                }
                break;
            case 2:
                System.out.print("Kombine anahtar fiyatları" +
                        "\n1-> 8 lik anahtar  20 TL" +
                        "\n2-> 10 luk anahtar  22 TL" +
                        "\n3-> 14 lük anahtar  25 Tl" +
                        "\n ürün seçin: ");
                int anahtarSecim = scan.nextInt();
                if (anahtarSecim == 1){
                    Kombine_Anahtar kombineAnahtar = new Kombine_Anahtar("8 lik anahtar", 20);
                    edit(kombineAnahtar);
                } else if (anahtarSecim == 2) {
                    Kombine_Anahtar kombineAnahtar = new Kombine_Anahtar("10 lik anahtar", 22);
                    edit(kombineAnahtar);
                } else if (anahtarSecim == 3){
                    Kombine_Anahtar kombineAnahtar = new Kombine_Anahtar("14 lik anahtar", 25);
                    edit(kombineAnahtar);
                } else {
                    System.out.println("Hatalı giriş yaptınız");
                }
                break;
            case 0:
                System.out.println("Geri dönülüyor");
                break;
        }
    }

    public void edit(LPG_Montaj_Malzemeleri lpgMontajMalzemeleri){
        setIsim(lpgMontajMalzemeleri.getIsim());
        setFiyat(lpgMontajMalzemeleri.getFiyat());
    }
    public void bilgiler(){
        System.out.print(
                "\n isim: " + this.getIsim() +
                "\n fiyat: " + this.getFiyat() + " TL");
    }

}
