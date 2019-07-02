#include<stdio.h>
int main()
{
  int n,f,t,s;
  scanf("%d",&n);
  f=n/100;
  t=n%10;
  s=f+t;
  printf("%d",s);
  return 0;
}