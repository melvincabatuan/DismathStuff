#include <stdio.h>

int linear_search(int arr[], int key, int begin, int end)
{
    /*
    INPUT :
            arr - a sequence of sorted integers;
            key - integer to search for;
            begin - start index;
            end - last index

    OUTPUT:
            index of the element or key IF found
            -1 IF not found
    */
    if (begin <= end)
    {
        if (arr[begin] == key)
            return begin;
        else
            return linear_search(arr, key, begin + 1, end);
    }
    return -1;
}

int main()
{
    int numbers[] = {1, 3, 7, 8, 9, 10, 17, 23, 25, 30, 31};
    int length = sizeof(numbers) / sizeof(numbers[0]);

    // Existent value/s
    printf("%d\n", linear_search(numbers, 1, 0, length - 1)); // 0
    printf("%d\n", linear_search(numbers, 31, 0, length - 1));   // 1

    // Nonexistent value
    printf("%d\n", linear_search(numbers, 88, 0, length - 1)); // -1
    return 0;
}
