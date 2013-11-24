package bingo_test;
// Generated 24-nov-2013 23:28:08 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Artikel generated by hbm2java
 */
public class Artikel  implements java.io.Serializable {


     private ArtikelId id;
     private Winkel winkel;
     private String artikelnaam;
     private Integer prijs;
     private Integer ptnwinst;
     private Integer minimumaantal;
     private Integer ptnkost;
     private Integer minimumbedrag;
     private Set artikelaankoops = new HashSet(0);

    public Artikel() {
    }

	
    public Artikel(ArtikelId id, Winkel winkel) {
        this.id = id;
        this.winkel = winkel;
    }
    public Artikel(ArtikelId id, Winkel winkel, String artikelnaam, Integer prijs, Integer ptnwinst, Integer minimumaantal, Integer ptnkost, Integer minimumbedrag, Set artikelaankoops) {
       this.id = id;
       this.winkel = winkel;
       this.artikelnaam = artikelnaam;
       this.prijs = prijs;
       this.ptnwinst = ptnwinst;
       this.minimumaantal = minimumaantal;
       this.ptnkost = ptnkost;
       this.minimumbedrag = minimumbedrag;
       this.artikelaankoops = artikelaankoops;
    }
   
    public ArtikelId getId() {
        return this.id;
    }
    
    public void setId(ArtikelId id) {
        this.id = id;
    }
    public Winkel getWinkel() {
        return this.winkel;
    }
    
    public void setWinkel(Winkel winkel) {
        this.winkel = winkel;
    }
    public String getArtikelnaam() {
        return this.artikelnaam;
    }
    
    public void setArtikelnaam(String artikelnaam) {
        this.artikelnaam = artikelnaam;
    }
    public Integer getPrijs() {
        return this.prijs;
    }
    
    public void setPrijs(Integer prijs) {
        this.prijs = prijs;
    }
    public Integer getPtnwinst() {
        return this.ptnwinst;
    }
    
    public void setPtnwinst(Integer ptnwinst) {
        this.ptnwinst = ptnwinst;
    }
    public Integer getMinimumaantal() {
        return this.minimumaantal;
    }
    
    public void setMinimumaantal(Integer minimumaantal) {
        this.minimumaantal = minimumaantal;
    }
    public Integer getPtnkost() {
        return this.ptnkost;
    }
    
    public void setPtnkost(Integer ptnkost) {
        this.ptnkost = ptnkost;
    }
    public Integer getMinimumbedrag() {
        return this.minimumbedrag;
    }
    
    public void setMinimumbedrag(Integer minimumbedrag) {
        this.minimumbedrag = minimumbedrag;
    }
    public Set getArtikelaankoops() {
        return this.artikelaankoops;
    }
    
    public void setArtikelaankoops(Set artikelaankoops) {
        this.artikelaankoops = artikelaankoops;
    }




}


