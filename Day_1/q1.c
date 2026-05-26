#include <stdio.h>

int sum(int n)
{
    int s = 0;
    for (int i = 1; i <= n; i++)
    {
        s = s + i;
    }
    return s;
}
int main()
{
    int n;
    printf("Enter number upto sum you want\n");
    scanf("%d", &n);

    printf("Sum of %d natural number is %d\n", n,sum(n));

    return 0;
}