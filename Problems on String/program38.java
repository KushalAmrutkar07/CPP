//Accept number ,accept position taggle the bit at that point & return the number (toogle case)
import java.lang.*;
import java.util.*;

//0000    0000   0000  0000   0000  0000   0000  0000
//  0         0           0         0         0      0        4       8
class Bitwise
{
    public int ToggleBit(int iNo,int iPos)
    {
       int iMask = 0X00000001;
       int iResult = 0;
       
       iMask = iMask << (iPos-1);
       
       iResult = iNo ^ iMask;
       return iResult;

    }
       
    

}

class program38 
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Enter number");
      int value = sobj.nextInt();
      
      System.out.println("Enter position");
      int pos = sobj.nextInt();

      Bitwise bobj = new Bitwise();
      int iRet = bobj.ToggleBit(value,pos);
      System.out.println("Updated number is : "+iRet);


   }
}


        
