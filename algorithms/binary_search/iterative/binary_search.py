# Time complexity: O(log n)

def binary_search(arr, key, begin, end):
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
    while begin < end:
        mid = (begin + end) // 2
        if arr[mid] < key:
            begin = mid + 1  # upper half
        else:
            end = mid        # lower half

    if arr[begin] == key:
        return begin

    return -1  # key not found


# Sample run
numbers = [1, 3, 7, 8, 9, 10, 17, 23, 25, 30, 31]
n = len(numbers)

# Existent value
print(binary_search(numbers, 1, 0, n - 1))  # 0
print(binary_search(numbers, 31, 0, n - 1))  # 10

# Nonexistent value
print(binary_search(numbers, 100, 0, n - 1))  # -1
