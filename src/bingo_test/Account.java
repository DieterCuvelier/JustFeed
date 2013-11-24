package bingo_test;
// Generated 24-nov-2013 23:28:08 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {


     private int accountnr;
     private String naam;
     private String email;
     private String adres;
     private Integer punten;
     private boolean wolverine;
     private Date startw;
     private boolean bigspender;
     private Date startb;
     private boolean major;
     private Date startm;
     private boolean bedrijf;
     private Integer btwnummer;
     private Set spaarkaarts = new HashSet(0);
     private Set winkels = new HashSet(0);

    public Account() {
    }

	
    public Account(int accountnr, boolean wolverine, boolean bigspender, boolean major, boolean bedrijf) {
        this.accountnr = accountnr;
        this.wolverine = wolverine;
        this.bigspender = bigspender;
        this.major = major;
        this.bedrijf = bedrijf;
    }
    public Account(int accountnr, String naam, String email, String adres, Integer punten, boolean wolverine, Date startw, boolean bigspender, Date startb, boolean major, Date startm, boolean bedrijf, Integer btwnummer, Set spaarkaarts, Set winkels) {
       this.accountnr = accountnr;
       this.naam = naam;
       this.email = email;
       this.adres = adres;
       this.punten = punten;
       this.wolverine = wolverine;
       this.startw = startw;
       this.bigspender = bigspender;
       this.startb = startb;
       this.major = major;
       this.startm = startm;
       this.bedrijf = bedrijf;
       this.btwnummer = btwnummer;
       this.spaarkaarts = spaarkaarts;
       this.winkels = winkels;
    }
   
    public int getAccountnr() {
        return this.accountnr;
    }
    
    public void setAccountnr(int accountnr) {
        this.accountnr = accountnr;
    }
    public String getNaam() {
        return this.naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdres() {
        return this.adres;
    }
    
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public Integer getPunten() {
        return this.punten;
    }
    
    public void setPunten(Integer punten) {
        this.punten = punten;
    }
    public boolean isWolverine() {
        return this.wolverine;
    }
    
    public void setWolverine(boolean wolverine) {
        this.wolverine = wolverine;
    }
    public Date getStartw() {
        return this.startw;
    }
    
    public void setStartw(Date startw) {
        this.startw = startw;
    }
    public boolean isBigspender() {
        return this.bigspender;
    }
    
    public void setBigspender(boolean bigspender) {
        this.bigspender = bigspender;
    }
    public Date getStartb() {
        return this.startb;
    }
    
    public void setStartb(Date startb) {
        this.startb = startb;
    }
    public boolean isMajor() {
        return this.major;
    }
    
    public void setMajor(boolean major) {
        this.major = major;
    }
    public Date getStartm() {
        return this.startm;
    }
    
    public void setStartm(Date startm) {
        this.startm = startm;
    }
    public boolean isBedrijf() {
        return this.bedrijf;
    }
    
    public void setBedrijf(boolean bedrijf) {
        this.bedrijf = bedrijf;
    }
    public Integer getBtwnummer() {
        return this.btwnummer;
    }
    
    public void setBtwnummer(Integer btwnummer) {
        this.btwnummer = btwnummer;
    }
    public Set getSpaarkaarts() {
        return this.spaarkaarts;
    }
    
    public void setSpaarkaarts(Set spaarkaarts) {
        this.spaarkaarts = spaarkaarts;
    }
    public Set getWinkels() {
        return this.winkels;
    }
    
    public void setWinkels(Set winkels) {
        this.winkels = winkels;
    }




}


