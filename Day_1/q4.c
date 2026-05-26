#include <stdio.h>

int digit(int n)
{
    int count = 0, r;
    while (n > 0)
    {
        r = n % 10;
        n = n / 10;
        count++;
    }
    return count;
}

int main()
{
    int n;
    printf("Enter number which digit you want \n");
    scanf("%d",&n);
    printf("Digit in %d is %d\n",n,digit(n));
    return 0;
}