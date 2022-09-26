#include<iostream>
 
 namespace Marvellous
{
 
    void fun()
     {
         std::cout<<"Inside fun\n";
     }
}


 namespace Infosystem
{
 
    void fun()
     {
         std::cout<<"Inside fun\n";
     }
}



int main()
{
  std::cout<<"Jay Ganesh\n";
  using namespace Marvellous;
  using namespace Infosystem;
  
 //fun();   //AMbiguity
Infosystem::fun();   

   return 0;
}