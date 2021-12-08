# Time complexity: O(n)

def linear_search(arr, key, begin, end):
    '''
    INPUT :
            arr - a sequence of sorted integers;
            key - integer to search for;
            begin - start index of the sequence;
            end - ending index of the sequence
    OUTPUT:
            index of the key if found
            -1 if not found
    '''
    if begin <= end:
        if arr[begin] == key:
            return begin
        else:
            return linear_search(arr, key, begin + 1, end)
    return -1


def main():

    # Sample run
    numbers = [1, 3, 7, 8, 9, 10, 17, 23, 25, 30, 31]
    length = len(numbers)

    # Existent value
    print(linear_search(numbers, 1, 0, length - 1))  # 0
    print(linear_search(numbers, 31, 0, length - 1))  # 10

    # Nonexistent value
    print(linear_search(numbers, 100, 0, length - 1))  # -1


if __name__ == '__main__':
    main()
