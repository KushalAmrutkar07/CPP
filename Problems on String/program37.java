 //write a program check whether 4 bit and 7  bit is on asel tar off , off asel tar on (toogle case)
import java.lang.*;
import java.util.*;

//0000    0000   0000  0000   0000  0000   0000  0000
//  0         0           0         0         0      0        4       8
class Bitwise
{
    public int OnBit(int iNo)        
    {
       int iMask =  0X0000048;                    //8,64;
       int iResult =  0;
  
      iResult = iNo ^ iMask;
  
      return iResult;
     
       
    }

}

class program37
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


        
