#include <stdio.h>

int factorial(int n)
{
    long fact = 1;
    for (int i = 1; i <= n; i++)
    {
        fact = fact * i;
    }
    return fact;
}
int main()
{
    int n;
    printf("Enter number which factorial you want\n");
    scanf("%d", &n);
    printf("Factorial of %d is %ld\n", n, factorial(n));
    return 0;
}