#include <stdio.h>
int sumOfDigit(int n)
{
    int r, sum = 0;
    while (n > 0)
    {
        r = n % 10;
        n = n / 10;
        sum += r;
    }
    return sum;
}
int main()
{
    int n;
    printf("Enter number which didgit's sum you want \n");
    scanf("%d", &n);
    printf("Sum of digits of %d is %d\n", n, sumOfDigit(n));
    return 0;
}