
package Logica;



public class ArtikelId  implements java.io.Serializable {


     private int artikelnr;
     private String winkelnaam;

    public ArtikelId() {
    }

    public ArtikelId(int artikelnr, String winkelnaam) {
       this.artikelnr = artikelnr;
       this.winkelnaam = winkelnaam;
    }
   
    public int getArtikelnr() {
        return this.artikelnr;
    }
    
    public void setArtikelnr(int artikelnr) {
        this.artikelnr = artikelnr;
    }
    public String getWinkelnaam() {
        return this.winkelnaam;
    }
    
    public void setWinkelnaam(String winkelnaam) {
        this.winkelnaam = winkelnaam;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArtikelId) ) return false;
		 ArtikelId castOther = ( ArtikelId ) other; 
         
		 return (this.getArtikelnr()==castOther.getArtikelnr())
 && ( (this.getWinkelnaam()==castOther.getWinkelnaam()) || ( this.getWinkelnaam()!=null && castOther.getWinkelnaam()!=null && this.getWinkelnaam().equals(castOther.getWinkelnaam()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getArtikelnr();
         result = 37 * result + ( getWinkelnaam() == null ? 0 : this.getWinkelnaam().hashCode() );
         return result;
   }   
}