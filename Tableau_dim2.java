/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableau_dim2;
import java.util.Scanner;

public class Tableau_dim2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int largeur, hauteur;  
        System.out.println("Entrez_la_largeur_de_l'image:_");
        largeur=sc.nextInt();
        System.out.println("Entrer_la_hauteur_de_l'image:_");
        hauteur=sc.nextInt();
        int[][] image=new int[largeur][hauteur];
        for(int x=0;x<largeur; x++){
            for(int y=0; y<hauteur; y++){ 
                do{ 
                    System.out.println("Entrer_la_valeur_du _point_("+x+","+y+":_");
                    image[x][y]=sc.nextInt();
                }while(image[x][y]<0||image[x][y]>255);
            }
        }
          int nbbl=0;
          int x; 
          int y;
          for(x=0; x<largeur; x++){
            for(y=0; y<hauteur; y++){
                if(image[x][y]==225){
                    nbbl++; 
                }
            }
                    image[x][y]=image[x][y]+30;
                }
                else{ 
                    image[x][y]=225;
                }
            }
        }
        
    }
    
}
