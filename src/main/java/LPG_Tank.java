import java.util.Scanner;

public class LPG_Tank {
    String marka;
    String tip;
    int hacim;
    int fiyat;

    public LPG_Tank() {
    }

    public LPG_Tank(String marka, int hacim, int fiyat) {
        this.marka = marka;
        this.hacim = hacim;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getHacim() {
        return hacim;
    }

    public void setHacim(int hacim) {
        this.hacim = hacim;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    Scanner scan = new Scanner(System.in);
    public void tankMarkası(int tipNo){
        if (tipNo == 1){
            tip = "Silindir";
            System.out.print("Tank Markaları ve Fiyatları " +
                    "\n   1-> Atiker Silindir Tank " +
                    "\n->32Lt  = 320 TL" +
                    "\n->40Lt  = 400 TL" +
                    "\n->60Lt  = 600 TL" +
                    "\n   2-> Fesa Silindir Tank " +
                    "\n->32Lt  = 300 TL" +
                    "\n->40Lt  = 370 Tl" +
                    "\n->60Lt  = 550 TL" +
                    "\n   0-> Geri git" +
                    "\n Tank Markasını seçin: ");
            int tankTipi = scan.nextInt();
            switch (tankTipi){
                case 1:
                    System.out.print("Tank Hacimleri" +
                            "\n1-> 32 Lt" +
                            "\n2-> 40 Lt" +
                            "\n3-> 60 Lt" +
                            "\n Hacim seçin: ");
                    int atikerHacim = scan.nextInt();
                    switch (atikerHacim){
                        case 1:
                            Atiker_Tank atikerTank1 = new Atiker_Tank("Atiker", 32, 320);
                            edit(atikerTank1);
                            break;
                        case 2:
                            Atiker_Tank atikerTank2 = new Atiker_Tank("Atiker", 40, 400);
                            edit(atikerTank2);
                            break;
                        case 3:
                            Atiker_Tank atikerTank3 = new Atiker_Tank("Atiker", 60, 600);
                            edit(atikerTank3);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Tank Hacimleri" +
                            "\n1-> 32 Lt" +
                            "\n2-> 40 Lt" +
                            "\n3-> 60 Lt" +
                            "\n Hacim seçin: ");
                    int fesaHacim = scan.nextInt();
                    switch (fesaHacim){
                        case 1:
                            Fesa_Tank fesaTank1 = new Fesa_Tank("Fesa", 32,300);
                            edit(fesaTank1);
                            break;
                        case 2:
                            Fesa_Tank fesaTank2 = new Fesa_Tank("Fesa", 40,370);
                            edit(fesaTank2);
                            break;
                        case 3:
                            Fesa_Tank fesaTank3 = new Fesa_Tank("Fesa", 60,550);
                            edit(fesaTank3);
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Geri dönülüyor");
                    break;
            }

        }
        if (tipNo == 2){
            tip = "Simit";
            System.out.print("Tank Markaları ve Fiyatları " +
                    "\n   1-> Atiker Simit Tank " +
                    "\n->35Lt  = 320 TL" +
                    "\n->42Lt  = 400 TL" +
                    "\n   2-> Fesa Simit Tank " +
                    "\n->35Lt  = 300 TL" +
                    "\n->42Lt  = 370 Tl" +
                    "\n   0-> Geri git" +
                    "\n Tank Markasını seçin: ");
            int tankTipi = scan.nextInt();
            switch (tankTipi) {
                case 1:
                    System.out.print("Tank Hacimleri" +
                            "\n1-> 35 Lt" +
                            "\n2-> 42 Lt" +
                            "\n Hacim seçin: ");
                    int atikerHacim = scan.nextInt();
                    switch (atikerHacim) {
                        case 1:
                            Atiker_Tank atikerTank1 = new Atiker_Tank("Atiker", 35,320);
                            edit(atikerTank1);
                            break;
                        case 2:
                            Atiker_Tank atikerTank2 = new Atiker_Tank("Atiker", 42,400);
                            edit(atikerTank2);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Tank Hacimleri" +
                            "\n1-> 35 Lt" +
                            "\n2-> 42 Lt" +
                            "\n Hacim seçin: ");
                    int fesaHacim = scan.nextInt();
                    switch (fesaHacim){
                        case 1:
                            Fesa_Tank fesaTank1 = new Fesa_Tank("Fesa", 35,300);
                            edit(fesaTank1);
                            break;
                        case 2:
                            Fesa_Tank fesaTank2 = new Fesa_Tank("Fesa", 42,370);
                            edit(fesaTank2);
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Geri dönülüyor");
                    break;
            }
        }
    }
    public void edit(LPG_Tank lpgTank){
        setMarka(lpgTank.getMarka());
        setHacim(lpgTank.getHacim());
        setFiyat(lpgTank.getFiyat());
    }
    public void bilgiler(){
        System.out.print(
                "\nTank Markası: " + this.getMarka() +
                "\nTank Tipi: " + this.getTip() +
                "\nTank Hacmi: " + this.getHacim() + " Lt" +
                "\nTank Fiyat: " + this.getFiyat() + " TL");
    }
}
