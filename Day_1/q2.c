#include <stdio.h>
int multiplication(int n)
{
    int table;
    for (int i = 1; i <= 10; i++)
    {
        table = n * i;
        printf("%d X %d=%d \n",n,i,table);
    }
    
}
int main()
{
    int n;
    printf("Enter number which table you want\n");
    scanf("%d",&n);
    printf("Table of %d is \n",n);
    multiplication(n);
    return 0;
}