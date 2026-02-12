#include <stdio.h>
#include <conio.h>
int main()
{
 int ci,p,r,n;
 printf("Enter the value of p");
 scanf("%d",&p);
 printf("Enter the value of r");
 scanf("%d,&r");
    printf("Enter the value of n");
    scanf("%d,&n");
    ci=p * pow((1+r/100),n);
    printf("The value of compound interest is %d",ci);
    getch();
}