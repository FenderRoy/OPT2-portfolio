package people;

public abstract class Persoon {
    private String naam;
    private String telefoonNummer;
    private String adress;
    private String email;

    public Persoon(String naam, String adress, String telefoonNummer){
        this.naam = naam;
        this.adress = adress;
        this.telefoonNummer = telefoonNummer;
    }

    public String getNaam() {
        return naam;
    }

    public String getTelefoonNummer() {
        return telefoonNummer;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }
}
