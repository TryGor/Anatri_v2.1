/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.utility;

/**
 *
 * @author TryGor
 */
public class GenerirajOperatere {
    public static void main(String[] args) {
        
        String naredba = "insert into operater(ime,prezime,korisnik,lozinka) values";
        System.out.print(naredba);
        int i=0;
        for(i=0;i<9999;i++){
            System.out.print( "('Goran " + i + "','Trifunović','Admin" + i + "',md5('Goc1977')),");
            if(i%10000==0){
                i++;
                System.out.println("('Goran " + i + "','Trifunović','Admin" + i + "',md5('Goc1977'));");
                System.out.println(naredba);
            }
            
        }
        
        i++;
         System.out.println("('Goran " + i + "','Trifunović','Admin" + i + "',md5('Goc1977'));");
    }
    
}
