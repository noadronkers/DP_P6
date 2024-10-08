package OVChipkaart;

import Reiziger.Reiziger;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class OVChipkaart {
    private int kaartNummer;
    private Date geldigTot;
    private int klasse;
    private float saldo;
    private Reiziger reiziger;

    public OVChipkaart(int kaartNummer, Date geldigTot, int klasse, float saldo, Reiziger reiziger) {
        this.kaartNummer = kaartNummer;
        this.geldigTot = geldigTot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reiziger = reiziger;
    }

    public OVChipkaart() {}

    public int getKaartNummer() {
        return kaartNummer;
    }

    public void setKaartNummer(int kaartNummer) {
        this.kaartNummer = kaartNummer;
    }

    public Date getGeldigTot() {
        return geldigTot;
    }

    public void setGeldigTot(Date geldigTot) {
        this.geldigTot = geldigTot;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = geldigTot != null ? dateFormat.format(geldigTot) : "onbekend";

        return "OVChipkaart:\n" +
                "  Kaartnummer: " + kaartNummer + "\n" +
                "  Geldig tot: " + formattedDate + "\n" +
                "  Klasse: " + klasse + "\n" +
                "  Saldo: " + saldo + "\n" +
                "  Reiziger: " + (reiziger != null ? reiziger.getId() + " (" + reiziger.getVoorletters() + " " + reiziger.getAchternaam() + ")" : "Geen reiziger") +
                "\n";
    }
}
