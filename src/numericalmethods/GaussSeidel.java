/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalmethods;

import static java.awt.PageAttributes.MediaType.A;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Shrestho
 */
public class GaussSeidel {
    public void seidel()
    {
        
 int i,j,k,n;
  int r=0;
 float e=(float) 0.01;
    Double a[][]=new Double[10][10];
    Float x[]=new Float[10];
    float sum,temp,error,big; 
   n=  (int) Double.parseDouble(JOptionPane.showInputDialog(null,"\nEnter the size of matrix: "));
    ArrayList<String> sku = new ArrayList<String> ();
    String s = null;
    ArrayList<String> sk = new ArrayList<String> ();
    String t = null;
   // printf("Enter the co-efficients of the equations: \n");
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=n+1;j++)
 {
  a[i][j]=  Double.parseDouble(JOptionPane.showInputDialog(null,"\nEnter the value A ["+i+"]["
                    +j+"]"));
 }
 }
 for(i=1;i<=n;i++)
 {
 x[i]=(float) 0.00;
 }
 do
 {
 big=0;
 r++;
 sku.add("iteration no:"+r+"\n");
 for(i=1;i<=n;i++)
 {
 sum=0;
 for(j=1;j<=n;j++)
 {
 if(j!=i)
 {
 sum=(float) (sum+a[i][j]*x[j]);
 }
 }
 temp=(float) ((a[i][n+1]-sum)/a[i][i]);
 error=(float) Math.abs(x[i]-temp);
 if(error>big)
 {
 big=error;
 }
 x[i]=temp;

 JOptionPane.showMessageDialog(null,"Iteration No:"+r+"\n      x"+i+"  =  "   +x[i]); 
        sku.add("\n       x"+i+"  =  "+x[i]+"\n");
        s=sku.toString();
       
 }
 JOptionPane.showMessageDialog(null,s);
 }
 while(big>=e);
 sk.add("so finally:\n");
 for(i=1;i<=n;i++)
 {  
 
   sk.add("\nx"+i+"  =  "+x[i]+"\n");
     t=sk.toString();  
  
 }
 JOptionPane.showMessageDialog(null,t);
  
 
}
    }
    

