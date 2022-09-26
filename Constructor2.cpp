#include<iostream>

using namespace std;

class Demo

{
  
 public:
       
       int x;  //Characteristics
       int y;  //characteristics 
  
    Demo()     //Default constructor
    {
     cout<<"Inside Default constructor\n";
     x = 0;
     y = 0;
    }
    
    Demo(int i , int j) //Parametrised constructor
    {
     cout<<"Inside Parametrised constructor\n";
     x=i;
     y=j;
    }
    
    Demo(Demo  &ref)  //Copy constuctor
    {
     cout<<"Inside copy constuctor\n";
    }

    ~Demo()         //Destructor
    {
     cout<<"Inside Destructor\n";
    }
};

int main()

{
  
  Demo obj1(11,21);
  Demo obj2(obj1);
  
  return 0;
}