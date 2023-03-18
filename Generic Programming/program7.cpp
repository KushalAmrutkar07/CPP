//generic way
#include<iostream>
using namespace std;

template<class T>
int Addition(T A,T B)
{
   T Ans;
  Ans = A + B;
  return Ans;
}

int main()
{
  int No1 = 11,No2 = 21;
  int ret = 0;
  
  ret = Addition(No1,No2);
  
  cout<<"Addition is :"<<ret<<endl;


  float fNo1 = 12.1,fNo2 = 21.90;
  float fret = 0.0;
  
  ret = Addition(fNo1,fNo2);
  
  cout<<"Addition is :"<<ret<<endl;
  return 0;
}
 