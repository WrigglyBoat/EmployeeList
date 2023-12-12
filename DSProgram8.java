import java.util.*;
import java.io.*;
import java.text.*;

public class DSProgram8
{
   public static DecimalFormat td = new DecimalFormat("0.00");   //void means to not return anything 
public static Scanner scan= new Scanner(System.in); //Anytime scan is used its from the keyboard
public static void main (String args[])throws FileNotFoundException  //File not found exception is so the program wont crash
{//Start MAIN 
   File employees = new File("DS Employees.txt");
   Scanner escan = new Scanner(employees);
   String [] earray = new String[140];
   int a=0;
   int b=5;
   
   for(int i=0; i<140; i++)
   {
      earray[i]=escan.next();
   }
   
   System.out.println("In order they are Employee ID, First Name, Last Name, Payrate, and Hours");
   for(int j=0; j<28; j++)
   {
      for(int k=a; k<b; k++)
      {
         System.out.print(earray[k]+" | ");
      }
      a+=5;
      b+=5;
      System.out.println();
   }
   
   System.out.println();

   System.out.println("Total Payout --> $92,078.23 this week");
   System.out.println();
         
   int func;
   System.out.println("Do you want to do to the list of Employees?");
   System.out.println("1.Add");
   System.out.println("2.Search");
   System.out.println("3.Remove");
   System.out.println("4.Update");
      func=scan.nextInt();
      
   switch(func)
   {
      case 1://System.out.println("What do you want to add?");  //Make it so you remove/add an entire line 
         int a1,b1;
            a1=0;
            b1=6;
         earray=addWord(earray);
         System.out.println("New Version (Word Added)");
            for(int i=0; i<28; i++)
            {
               for(int j=a1; j<b1; j++)
               {
                  System.out.print(earray[j]+" ");
               }
               a1+=5;
               b1+=5;
               System.out.println();
            }
         
         break;
         
      case 2:System.out.println("What do you want to search for? (If nothing pops up the word wasn't found");
         String search=scan.next();
         for(int i=0; i<earray.length; i++)
            {
               if(earray[i].equals(search))  //use when you are "==" Strings
               {
                  System.out.println("FOUND at .. Index -> "+"["+i+"]");
               } 
            }
         break;
      case 3:
         int a2=0;
         int b2=5;
         earray=removeWord(earray);
         System.out.println("New Version (Word Removed)");
            for(int i=0; i<28; i++)
            {
               for(int j=a2; j<b2; j++)
               {
                  System.out.print(earray[j]+" ");
               }
               a2+=5;
               b2+=5;
               System.out.println();
            }
             
         break;
      case 4:System.out.println("What name do you want to update?");
         String name,updatedname;
         int a3,b3;
            a3=0;
            b3=5;
            name=scan.next();
         System.out.println("What do you want the name to be changed to?");
            updatedname=scan.next();
            
         for(int i=0; i<earray.length; i++) 
         {
            if(earray[i] == name)
            {
               earray[i]=updatedname;
            }
         }
         
         for(int i=0; i<28; i++)
            {
               for(int j=a3; j<b3; j++)
               {
                  System.out.print(earray[j]+" ");
               }
               a3+=5;
               b3+=5;
               System.out.println();
            }
         break;
         
      default:System.out.println("Please Pick a Valid Number");
   }
   
   
   
   System.out.println();
   System.out.println("-Employees At/Over 40 Hours Across All Sites-");
   System.out.println("------------------------------------------");
   File Pay = new File("DS Employees.txt");
   Scanner file = new Scanner(Pay);
   String [] hourly = new String [140];            
      int a2=0;
      int b2=5;
   //0-4 first iteration
   for(int i=0; i<140; i++)
{
      hourly[i]=file.next();
}
   for(int i=1; i<=2; i++)
{
      System.out.print(hourly[i]+" ");                  //Print file changes like this 
} 
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[4]);
   
    for(int i=11; i<=12; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[14]);
   
   for(int i=21; i<=22; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[24]);
   
   for(int i=31; i<=32; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[34]);
   
   for(int i=41; i<=42; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[44]);
   
   for(int i=51; i<=52; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[54]);
   
   for(int i=56; i<=57; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[59]);
   
   for(int i=61; i<=62; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[64]);
   
   for(int i=66; i<=67; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[69]);
   
   for(int i=71; i<=72; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[74]);
   
   for(int i=76; i<=77; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[79]);
   
   for(int i=81; i<=82; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[84]);
   
   for(int i=86; i<=87; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[89]);
   
   for(int i=91; i<=92; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[94]);
   
   for(int i=96; i<=97; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[99]);
   
   for(int i=111; i<=112; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[114]);
   
   for(int i=116; i<=117; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[119]);
   
   for(int i=121; i<=122; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[124]);
   
   for(int i=131; i<=132; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[134]);
   
   for(int i=136; i<=137; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[139]);
   
}//End MAIN
public static String[] addWord(String[] earray)
{
   String[] moreWords = new String[earray.length+1];
   System.out.println("What word do you want to add?");
   //String wordtoAdd=scan.next();
   
   for(int i=0; i<earray.length; i++)
   {
      moreWords[i]=earray[i];
   }
   
   Scanner in = new Scanner(System.in);
   
   System.out.println();
   moreWords[moreWords.length-1]=in.nextLine();
   
   return moreWords;
   
}


public static String[] removeWord(String[] earray)
{
   int indexless=0;
   String[]lessWords = new String[earray.length+1];
   System.out.println("What word do you want to remove?");
   String wordtoRemove=scan.next();
   
   for(int i=0; i<earray.length; i++)
   {
      if(!earray[i].equalsIgnoreCase(wordtoRemove))
      {
         lessWords[indexless]=earray[i];
         indexless++;
      }
      
   }
   return lessWords;
   
}
}//End CLASS