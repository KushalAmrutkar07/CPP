//Accept two string from user & comapre 2nd string of the 1st string

#include<iostream>
using namespace std;

bool strcmpX(char *src, char *dest)
{
   while((*src != '\0') &&(*dest != '\0'))
   {
      if(*src != *dest)
      {
         break;
      }
      src++;
      dest++;
  }
  
  if(*src == '\0' && *dest == '\0')
  {
     return true;
  }
  else
  {
    return false;
  }   
 
}

int main()
{
   char Arr[20]; //Bharaleleli book
   char Brr[20];   //kori book 
   bool bRet;
     
   cout<<"Enter first string"<<endl;
   cin.getline(Arr,20);
   
   cout<<"Enter second string"<<endl;
   cin.getline(Brr,20);

   bRet= strcmpX(Arr,Brr);
   
   if(bRet == true)
   {
       cout<<"String are equal"<<endl;
   }
   else
   {
      cout<<"String are not equal"<<endl;
   }
    
   cout<<"String after compare:"<<Arr<<endl;
   
   return 0;
}
