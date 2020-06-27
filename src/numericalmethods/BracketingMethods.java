/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalmethods;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Shrestho
 */
public class BracketingMethods {
     Scanner input=new Scanner(System.in);
    float b,t;

  
    public  float f(float x)
    {
        return (float) (4*x*x*x-6*x*x+7*x-2.3);
    }
    public void bisec()
{
    ImageIcon img=new ImageIcon("bi.jpg");
  float x1,x2,x3;
         float e=  (float) .01;
         JOptionPane.showMessageDialog(null,"Press Ok to continue","Bisection Method",JOptionPane.PLAIN_MESSAGE ,img);
    x1=Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to Bisection Methods\nOur Function is 4x³-6x²+7x-2.3\n Please Enter your first guess x1 to continue",""));
x2=Integer.parseInt(JOptionPane.showInputDialog(null,"\nPlease Enter your 2nd guess x2 to continue",""));      
         int ita = 0;
   ArrayList<String> sku = new ArrayList<String> ();
   
          String s1 = null;
         int i=0;


    do
    {   
        ita++;
        x3=(x1+x2)/2;
         sku.add("\nIteration no:"+ita+"\nx1="+x1+"  \t x2="+x2+" x3="+x3);
        s1=sku.toString();
          JOptionPane.showMessageDialog(null,"Iteration no:"+ita+"\nx1="+x1+"  \t x2="+x2+" x3="+x3+"\n Press Ok for next Iteration");
       
        if(f(x3)==0)
        {
            break;
        }
        else if(f(x3)>0)
        {
            x2=x3;
        }
         else if(f(x3)<0)
             
             
        {
            x1=x3;
        }
      
         
         

    }while(Math.abs(f(x3))>e);
    
   
    
    JOptionPane.showMessageDialog(null,s1);
    JOptionPane.showMessageDialog (null,"\nRoot=:"+x3);
    JOptionPane.showMessageDialog(null,"\nNo of Iterations :"+ita);
    
}

    
    
    
    
    
    
}
