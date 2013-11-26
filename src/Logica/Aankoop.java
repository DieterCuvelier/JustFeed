package Logica;
// Generated 24-nov-2013 23:28:08 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Aankoop generated by hbm2java
 */
public class Aankoop  implements java.io.Serializable {


     private int transactienr;
     private Spaarkaart spaarkaart;
     private Vestiging vestiging;
     private Date datum;
     private Integer ptnplus;
     private Integer ptnmin;
     private Integer totprijs;
     private Set artikelaankoops = new HashSet(0);

    public Aankoop() {
    }

	
    public Aankoop(int transactienr, Spaarkaart spaarkaart, Vestiging vestiging) {
        this.transactienr = transactienr;
        this.spaarkaart = spaarkaart;
        this.vestiging = vestiging;
    }
    public Aankoop(int transactienr, Spaarkaart spaarkaart, Vestiging vestiging, Date datum, Integer ptnplus, Integer ptnmin, Integer totprijs, Set artikelaankoops) {
       this.transactienr = transactienr;
       this.spaarkaart = spaarkaart;
       this.vestiging = vestiging;
       this.datum = datum;
       this.ptnplus = ptnplus;
       this.ptnmin = ptnmin;
       this.totprijs = totprijs;
       this.artikelaankoops = artikelaankoops;
    }
   
    public int getTransactienr() {
        return this.transactienr;
    }
    
    public void setTransactienr(int transactienr) {
        this.transactienr = transactienr;
    }
    public Spaarkaart getSpaarkaart() {
        return this.spaarkaart;
    }
    
    public void setSpaarkaart(Spaarkaart spaarkaart) {
        this.spaarkaart = spaarkaart;
    }
    public Vestiging getVestiging() {
        return this.vestiging;
    }
    
    public void setVestiging(Vestiging vestiging) {
        this.vestiging = vestiging;
    }
    public Date getDatum() {
        return this.datum;
    }
    
    public void setDatum(Date datum) {
        this.datum = datum;
    }
    public Integer getPtnplus() {
        return this.ptnplus;
    }
    
    public void setPtnplus(Integer ptnplus) {
        this.ptnplus = ptnplus;
    }
    public Integer getPtnmin() {
        return this.ptnmin;
    }
    
    public void setPtnmin(Integer ptnmin) {
        this.ptnmin = ptnmin;
    }
    public Integer getTotprijs() {
        return this.totprijs;
    }
    
    public void setTotprijs(Integer totprijs) {
        this.totprijs = totprijs;
    }
    public Set getArtikelaankoops() {
        return this.artikelaankoops;
    }
    
    public void setArtikelaankoops(Set artikelaankoops) {
        this.artikelaankoops = artikelaankoops;
    }




}


