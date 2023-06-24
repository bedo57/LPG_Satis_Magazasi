public class Sepet {
    String montajKitiMarka;
    String montajSistemi;
    int montajFiyat;
    String tankMarka;
    String tankTip;
    int tankHacim;
    int tankFiyat;
    String malzemeIsim;
    int malzemeFiyat;
    int toplamFiyat;

    public Sepet(String montajKitiMarka, String montajSistemi, int montajFiyat) {
        this.montajKitiMarka = montajKitiMarka;
        this.montajSistemi = montajSistemi;
        this.montajFiyat = montajFiyat;
    }
    public Sepet(String tankMarka, String tankTip, int tankHacim, int tankFiyat){
        this.tankMarka = tankMarka;
        this.tankTip = tankTip;
        this.tankHacim = tankHacim;
        this.tankFiyat = tankFiyat;
    }
    public Sepet(String malzemeIsim, int malzemeFiyat) {
        this.malzemeIsim = malzemeIsim;
        this.malzemeFiyat = malzemeFiyat;
    }

    public void sepet(){
        
    }
    public void sepetEkle(){
        
    }

}
