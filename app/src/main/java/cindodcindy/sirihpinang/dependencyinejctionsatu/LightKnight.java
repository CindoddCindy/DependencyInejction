package cindodcindy.sirihpinang.dependencyinejctionsatu;

public class LightKnight {

    private Senjata senjata;

    public  LightKnight(Senjata senjata){
        this.senjata=senjata;

    }

    String setEquip(){
        return "kelompok Light Knight bertempur menggunakan " + senjata.getNamaPedang();

    }
}
