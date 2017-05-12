/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
  
 
 
  public class Shirt {
  public int shirtID = 0;
  public String description = "-description requiered-";
  public char colorCode = 'U';
  public double price = 0.0;
  public int quantityInStock=0;
  
  
 public void displayShirtInformation() { 
  System.out.println("Shirt ID:" + shirtID);
  System.out.println("Shirt description:" + description); 
  System.out.println("Color Code:" + colorCode);
  System.out.println("Shirt price: " + price);
  System.out.println("Quantity in stock " + quantityInStock);
  }
    public static void main (String args[] ) {
    Shirt myShirt; 
    myShirt = new Shirt () ;
    myShirt.displayShirtInformation();
    } 
  }
  
