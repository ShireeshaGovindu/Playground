#include<stdio.h>
int main()
{
  int n,f,s;
  scanf("%d",&n);
  f=n%100;
  s=f/10;
  printf("%d",s);
  return 0;
}