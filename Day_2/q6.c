#include <stdio.h>

void reverse(int n)
{
    int r;
    while (n > 0)
    {
        r = n % 10;
        n = n / 10;
        printf("%d", r);
    }
}
int main()
{
    int n;
    printf("Enter number which reverse you want \n");
    scanf("%d", &n);
    reverse(n);
    return 0;
}