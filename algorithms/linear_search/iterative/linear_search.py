# Time complexity: O(n)

def linear_search(arr, key, length):
    '''
    INPUT :
            arr - a sequence of sorted integers;
            key - integer to search for;
            length - sequence size
    OUTPUT:
            index of the key if found
            -1 if not found
    '''
    for i in range(length):
        if arr[i] == key:
            return i
    return -1

    # for idx, elem in enumerate(arr):
    #     if elem == key:
    #         return idx
    # return -1


def main():

    # Sample run
    numbers = [1, 3, 7, 8, 9, 10, 17, 23, 25, 30, 31]
    length = len(numbers)

    # Existent value
    print(linear_search(numbers, 1, length))  # 0
    print(linear_search(numbers, 31, length))  # 10

    # Nonexistent value
    print(linear_search(numbers, 100, length))  # -1


if __name__ == '__main__':
    main()
