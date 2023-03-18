//write a program check whether 27 bit is on or off asel tari on kara
import java.lang.*;
import java.util.*;

//0000    0000   0000  0000   0000  0000   0000  0000
//  0         4           0         0         0      0        0        0
class Bitwise
{
    public int OnBit(int iNo)        
    {
       int iMask =  0X04000000;                    //67108865;
       int iResult =  0;
  
      iResult = iNo | iMask;
  
      return iResult;
     
       
    }

}

class program35
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Enter number");
      int value = sobj.nextInt();
      
      Bitwise bobj = new Bitwise();
      int iret = bobj.OnBit(value);
      
     System.out.println("Updated number is : "+iret);
   }
}


        
