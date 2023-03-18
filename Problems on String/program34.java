//write aprogram check whether 4 bit is on or off asel tari on kara
import java.lang.*;
import java.util.*;

//0000    0000   0000  0000   0000  0000   0000  0000
//  0         0           0         0         0      0        0        8 
class Bitwise
{
    public int OnBit(int iNo)        
    {
       int iMask =  0X00000008;                    //8;
       int iResult =  0;
  
      iResult = iNo | iMask;
  
      return iResult;
     
       
    }

}

class program34
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


        
