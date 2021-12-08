#include <stdio.h>

int linear_search(int arr[], int length, int key)
{
    /*
    INPUT :
            arr - a sequence of sorted integers;
            key - integer to search for;
            length - size of array;

    OUTPUT:
            index of the element or key IF found
            -1 IF not found
    */
    for (int i = 0; i < length; i++)
        if (arr[i] == key)
            return i;
    return -1;
}

int main()
{
    int numbers[] = {1, 3, 7, 8, 9, 10, 17, 23, 25, 30, 31};
    int length = sizeof(numbers) / sizeof(numbers[0]);

    // Existent value/s
    printf("%d\n", linear_search(numbers, length, 1));  // 0
    printf("%d\n", linear_search(numbers, length, 31)); // 1

    // Nonexistent value
    printf("%d\n", linear_search(numbers, length, 88)); // -1
    return 0;
}
