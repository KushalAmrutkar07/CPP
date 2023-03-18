//write aprogram check whether 14 bit is on or off
import java.lang.*;
import java.util.*;

//0000    0000   0000  0000   0000  0000   0000  0000
//  0       0     0      0      2    0      0      0
class Bitwise
{
    public boolean CheckBit(int iNo)        
    {
       int iMask =  0X00002000;                    //8192;
       int iResult =  0;
  
      iResult = iNo & iMask;
  
      if(iResult == 0)
      {
         return false;
      }
      else
      {
         return true;
      }
       
    }

}

class program33
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Enter number");
      int value = sobj.nextInt();
      
      Bitwise bobj = new Bitwise();
      boolean bret = bobj.CheckBit(value);
      
      if(bret == true)
      {
          System.out.println("Bit is on");
      }
      else
     {
        System.out.println("Bit is off");
     }
   }
}


        
