
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalmethods;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Shrestho
 */
public class NumericalMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
      int x;
        ImageIcon img=new ImageIcon("srs.png");
        JOptionPane.showMessageDialog(null,"PRESS OK TO CONTINUE","Numerical Methods",JOptionPane.PLAIN_MESSAGE, img);
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to Numerical Methods\nPlease Enter your choice to continue\nEnter 1 for Brackeing Method(Bisecion) \nEnter 2 for Open Method(Fixed Point)\nEnter 3 for Naive Gauss Elimination Method\nEnter 4 for Gauss Gordan Method\nEnter 5 for Gauss Seidel Method\nEnter 6 for Linear Regression\nEnter 7 for Newton's divided-difference (Linear Interpolation)\nEnter 8 for Trapizoidal Rule",""));
        System.out.print(x);
        if(x==1)
        {
            
        BracketingMethods a=new BracketingMethods();
        a.bisec();
    }
        else if(x==2)
        {
        FixedPoint k=new FixedPoint();
        k.Fixed();
        }
        else if(x==3)
        {
        NaiveGaussElimination p=new NaiveGaussElimination();
       p.elimination();
        }
        else if(x==4)
        {
            GaussJordan l=new GaussJordan();
            l.jordan();
        }
        else if(x==5)
        {
            GaussSeidel c=new GaussSeidel();
           c.seidel();
        }
         else if(x==6)
        {
            LinearRegression p=new LinearRegression();
            p.reg();
            

        }
        else if(x==7)
        {
            NewtonDD g=new NewtonDD();
            g.linear();
            

        }
        else if(x==8)
        {
            Last kkk=new Last();
            kkk.last();
            

        }
    }

    private static class Last {

        
             public double  y(float x)
{
    // Declaring the function f(x) = 1/(1+x*x)
    return (0.2+25*x-200*x*x+675*x*x*x-900*x*x*x*x+400*x*x*x*x*x);
}
    public void last()
    {
        
    
        

// Function to evalute the value of integral
JOptionPane.showMessageDialog(null,"Our Function\nF(x)=0.2+25x-200x²+675x³-900x⁴+400x⁵");
    float a = 0;
float b = 0;
float n = 0;
a=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter x0","")); 
b=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter xn","")); 
n=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter n","")); 
    // Grid spacing
    float h = (b-a)/n;

    // Computing sum of first and last terms
    // in above formula
    float s = (float) (y(a)+y(b));
    int i;

    // Adding middle terms in above formula
    for ( i = 1; i < n; i++)
        s += 2*y(a+i*h);

    // h/2 indicates (b-a)/2n. Multiplying h/2
    // with s.
    float I= (h/2)*s;
    JOptionPane.showMessageDialog(null,"Integration:"+ I);
float e=(float) 1.640533;
float c;
c=((I-e)/e)*100;
JOptionPane.showMessageDialog(null,"Relative Error  :  "+c+"%");
float E;
E=(-(b-a)*(b-a)*(b-a)/(12*n*n))*(-60);
JOptionPane.showMessageDialog(null,"Ea     :   "+E);


}

// Driver program to test above function


            
        }
    }


    