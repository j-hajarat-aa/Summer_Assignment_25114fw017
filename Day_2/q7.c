#include <stdio.h>
int productOfDigit(int n)
{
    int r, product = 1;
    while (n > 0)
    {
        r = n % 10;
        n = n / 10;
        product = product * r;
    }
    return product;
}
int main()
{
    int n;
    printf("Enter number which digit's product you want\n");
    scanf("%d", &n);
    printf("Product of didits of %d is %d\n", n, productOfDigit(n));
    return 0;
}