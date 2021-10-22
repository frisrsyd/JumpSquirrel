
/**
 * Write a description of class MainSquirrelJump here.
 * Tugas 2 PBO
 * @Faris Rasyid
 * @JumpSquirrel
 */
public class Pemain
{
    // instance variables - replace the example below with your own
    private String nama;
    private int nilai;
    boolean checkLangkah;

    /**
     * Constructor for objects of class Pemain
     */
    public Pemain(String nama)
    {
        // initialise instance variables
        this.nama =  nama;
    }

    public String getNama()
    {
        return nama;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public int getNilai()
    {
        return nilai;
    }
    public void setNilai(int nilaiBaru)
    {
        nilai = nilaiBaru;
    }
    public void buatSquirrel(int max)
    {   
        double buatSquirrel = 1 + Math.random() * (max - 1);
        this.nilai = (int) buatSquirrel;
    }
    public void lompat(String arah)
    {   
        arah = arah.toLowerCase();
        String kiri = "kiri";
        String kanan = "kanan";
        String atas = "atas";
        String bawah = "bawah";
        if (arah.equalsIgnoreCase(kiri) == true){
        this.nilai -= 1;
            System.out.println("Squirrel is at number: " + getNilai());
        checkLangkah = true;
    }else if (arah.equalsIgnoreCase(kanan) == true){
        this.nilai += 1;
        System.out.println("Squirrel is at number: " + getNilai());
        checkLangkah = true;
    }else if (arah.equalsIgnoreCase(atas) == true){
        this.nilai -= 10;
        System.out.println("Squirrel is at number: " + getNilai());
        checkLangkah = true;
    }else if (arah.equalsIgnoreCase(bawah) == true){
        this.nilai += 10;
        System.out.println("Squirrel is at number: " + getNilai());
        checkLangkah = true;
    }else {
        System.out.println("Wrong jump location. Try again! (kiri-kanan-atas-bawah)");
        System.out.println("Squirrel is at number: " + getNilai());
        checkLangkah = false;
    }
    }
}
