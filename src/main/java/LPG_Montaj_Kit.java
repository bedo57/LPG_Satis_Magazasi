import java.util.Scanner;

public class LPG_Montaj_Kit {
    String marka;
    String montajSistemi;
    int fiyat;

    public LPG_Montaj_Kit() {
    }

    public LPG_Montaj_Kit(String marka, int fiyat) {
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMontajSistemi() {
        return montajSistemi;
    }

    public void setMontajSistemi(String montajSistemi) {
        this.montajSistemi = montajSistemi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    Scanner scan = new Scanner(System.in);
    public void montajKitMarkası(int sistemNo){

        if (sistemNo == 1){
            montajSistemi = "Sıralı Sistem";
            System.out.print("Kit Markaları" +
                    "\n1-> Atiker = 1100 TL" +
                    "\n2-> AKL = 1300 TL" +
                    "\n3-> Mimgas = 900 TL" +
                    "\n0-> Geri git" +
                    "\n Kit markasını seçin: ");
            int marka = scan.nextInt();
            switch (marka){
                case 1:
                    Atiker_Montaj_Kit atikerMontajKit = new Atiker_Montaj_Kit();
                    edit(atikerMontajKit);
                    break;
                case 2:
                    AKL_Montaj_Kit aklMontajKit = new AKL_Montaj_Kit();
                    edit(aklMontajKit);
                    break;
                case 3:
                    Mimgas_Montaj_Kit mimgasMontajKit = new Mimgas_Montaj_Kit();
                    edit(mimgasMontajKit);
                    break;
                case 0:
                    System.out.println("Geri dönülüyor");
                    break;
            }

        } else if (sistemNo == 2){
            montajSistemi = "Karbüratörlü Sistem";
            System.out.print("Kit Markaları" +
                    "\n1-> Atiker = 900 TL" +
                    "\n2-> AKL = 1100 TL" +
                    "\n3-> Mimgas = 700 TL" +
                    "\n0-> Geri git" +
                    "\n Kit markasını seçin: ");
            int marka = scan.nextInt();
            switch (marka){
                case 1:
                    Atiker_Montaj_Kit atikerMontajKit = new Atiker_Montaj_Kit();
                    edit(atikerMontajKit);
                    atikerMontajKit.setFiyat(fiyat-200);
                    break;
                case 2:
                    AKL_Montaj_Kit aklMontajKit = new AKL_Montaj_Kit();
                    edit(aklMontajKit);
                    aklMontajKit.setFiyat(fiyat-200);
                    break;
                case 3:
                    Mimgas_Montaj_Kit mimgasMontajKit = new Mimgas_Montaj_Kit();
                    edit(mimgasMontajKit);
                    mimgasMontajKit.setFiyat(fiyat-200);
                    break;
                case 0:
                    System.out.println("Geri dönülüyor");
                    break;
            }
        } else {
            System.out.println("Hatalı giriş yaptınız");
        }

    }

    public void edit (LPG_Montaj_Kit lpgMontajKit){
        this.setMarka(lpgMontajKit.getMarka());
        this.setFiyat(lpgMontajKit.getFiyat());
    }
    public void bilgiler(){
        System.out.println("\nLPG Montaj Kiti Markası: " + this.getMarka() +
                "\nLPG Montaj Kiti Sistemi: " + this.getMontajSistemi() +
                "\nLPG Montaj Kiti Fiyatı: " + this.getFiyat() + " TL");
    }
}
