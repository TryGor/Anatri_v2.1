package anatri.utility;

import anatri.model.Operater;

/**
 *
 * @author TryGor
 */
public class Pomocno {
    
     public static Operater operater;
     
     public static final String FORMAT_DATUM="dd. MMMM YYYY.";
     public static final String FORMAT_DATUM_UNOS="dd.MM.YYYY.";
     public static final String FORMAT_DATUM_VRIJEME="dd.MM.YYYY. HH:mm:ss";
     
     public static void setOperater(Operater o) {
         operater=o;
        
    }
     public static Operater getOperater(){
    
        return operater;
}
}
