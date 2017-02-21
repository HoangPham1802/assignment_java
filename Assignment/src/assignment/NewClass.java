/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Raksaka
 */
class Bank{  
int getRateOfInterest(){return 0;}  
}  
  
class VCB extends Bank{  
@Override
int getRateOfInterest(){return 8;}  
}  
  
class AGR extends Bank{  
@Override
int getRateOfInterest(){return 7;}  
}  
class CTG extends Bank{  
@Override
int getRateOfInterest(){return 9;}  
}  
  
class Test2{  
public static void main(String args[]){  
VCB s=new VCB();  
AGR i=new AGR();  
CTG a=new CTG();  
System.out.println("VCB Rate of Interest: "+s.getRateOfInterest());  
System.out.println("AGR Rate of Interest: "+i.getRateOfInterest());  
System.out.println("CTG Rate of Interest: "+a.getRateOfInterest());  
}  
}  