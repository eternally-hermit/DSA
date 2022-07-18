
def fibbonacci(n,dict):

    if dict.get(n) == None:
        return dict[n]

    if n <= 1:
        dict[n] = n
        return n
    
    fib1 = fibbonacci(n-1,dict)
    fib2 = fibbonacci(n-2,dict)
    fib = fib1 + fib2

    dict[n] = fib

    return fib


if __name__ == '__main__':
    print(fibbonacci(10,{}))
