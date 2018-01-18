
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ICTKVPJB
 */
public class cubacuba {
    import java.util.Scanner;
    public static void main(String args[])
{
    Scanner input=new Scanner(System.in);
    
    System.out.print("masukkan berat anda:");
    double berat = input.nextDouble();
    
    System.out.print("masukkan tinggi anda:");
    double tinggi = input.nextDouble();
    
    double jum_bmi=(berat/tinggi * tinggi);
    
    if (jum_bmi <18.5)
    {System.out.print("kurang berat badan");}
    
    else if (jum_bmi <25 && jum_bmi >185)
    {System.out.print("normal");}
    
    else if (jum_bmi <30 && jum_bmi >25)
    {System.out.print("berat badan berlebihan");}
    
    else
    {System.out.print("gemuk");}
    
    {System.out.println("index bmi anda ialah "+jum_bmi);}
}
   
    
}

}
