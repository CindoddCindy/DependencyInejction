package cindodcindy.sirihpinang.dependencyinejctionsatu;

public class Senjata {

    public  String namaPedang;
    public  String namaTombak;

    public Senjata (String namaPedang, String namaTombak){
        this.namaPedang=namaPedang;
        this.namaTombak=namaTombak;
    }

    String getNamaPedang(){
        return namaPedang;
    }

    String getNamaTombak(){
        return namaTombak;
    }

}
