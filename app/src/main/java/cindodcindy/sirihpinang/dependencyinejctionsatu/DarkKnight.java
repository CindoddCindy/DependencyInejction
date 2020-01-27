package cindodcindy.sirihpinang.dependencyinejctionsatu;

public class DarkKnight {

    private  Senjata senjata;

    public  DarkKnight(Senjata senjata){
        this.senjata=senjata;
    }

    String setEquip(){
        return "Kelompok Dark Knight bertempur menggunakan " + senjata.getNamaTombak();
    }
}
