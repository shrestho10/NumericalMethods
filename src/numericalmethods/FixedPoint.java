/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalmethods;

import static java.lang.Math.abs;
import static java.lang.Math.exp;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Shrestho
 */
public class FixedPoint {
    

float f(float x)
{
  return (float) Math.exp(-x);
}

public void  Fixed()
{   ImageIcon img=new ImageIcon("fi.jpg");
JOptionPane.showMessageDialog(null,"PRESS OK TO CONTINUE","Fixed Point Iteration",JOptionPane.PLAIN_MESSAGE, img);
    Scanner input=new Scanner(System.in);
  float x0,x1=0,tmp,eps=(float) 0.001;
  int iteration=0;
  
  x0=Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to Fixedpoint Methods\nOur Function is e^(-x)-x=0\n\n Please Enter your  guess x1 to continue",""));
   ArrayList<String> sku = new ArrayList<String> ();
   
          String s1 = null;
  do
  {
    tmp=x1;
    x1=f(x0);
    iteration++;
    sku.add("\niteration:"+iteration+",\t x1="+x1);
     s1=sku.toString();
    JOptionPane.showMessageDialog(null,"\niteration:"+iteration+",\t x1="+x1+"\n Press Ok for next Iteration");
    x0=x1;
  }while(abs(tmp-x1)>eps);
   JOptionPane.showMessageDialog(null,s1);
  JOptionPane.showMessageDialog(null,"\n\n Real root="+x1+",\n Total Number of Iterations="+iteration);
 
}

    
}
