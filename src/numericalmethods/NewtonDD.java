/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalmethods;

import javax.swing.JOptionPane;

/**
 *
 * @author Shrestho
 */
class NewtonDD {
     public void linear()
    {
         float[] x=new float[10];
         float [][]y=new float[10][10];
                 float sum,p,u,temp;
  int i,n,j,k=0,f,m;
  

   n=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the value of n","")); 
  for(i=0; i<n; i++)
  {
   x[i]=Float.parseFloat(JOptionPane.showInputDialog(null,"\nEnter the value of x"+(i+1)));
   y[k][i]=Float.parseFloat(JOptionPane.showInputDialog(null,"\nEnter the value F(x"+(i+1)+")"));
  }
  p=Float.parseFloat(JOptionPane.showInputDialog(null,"\nEnter x for finding F(x)"));

  for(i=1;i<n;i++)
  {
    k=i;
    for(j=0;j<n-i;j++)
    {
     y[i][j]=(y[i-1][j+1]-y[i-1][j])/(x[k]-x[j]);
     k++;
    }
  }



   i=0;



  do
  {
   if(x[i]<p && p<x[i+1])
    k=1;
   else
    i++;
  }while(k != 1);
  f=i;

  sum=0;
  for(i=0;i<n-1;i++)
  {
   k=f;
   temp=1;
   for(j=0;j<i;j++)
   {
    temp = temp * (p - x[k]);
    k++;
   }
    sum = sum + temp*(y[i][f]);
  }
  JOptionPane.showMessageDialog(null,"F("+p+") = "+sum);
    }
    
}
