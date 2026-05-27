#include <stdio.h>

int main()
{
    int r, n, reverse = 0,temp;

    printf("ENter number which you want to check\n");
    scanf("%d", &n);

     temp = n;
    while (n > 0)
    {
        r = n % 10;
        reverse = reverse * 10 + r;
        n = n / 10;
    }
    if (temp == reverse)
    {
        printf("Number is palindrome\n");
    }
    else
        printf("Number is not palindrome\n");
    return 0;
}