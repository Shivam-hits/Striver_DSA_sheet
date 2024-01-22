# Q) Given an integer N, write a program to count the number of digits in N.

# python

def No_digits(num):
    t=num
    s=0
    while t>0:
        t=t//10
        s=s+1

    return s

def In():
    num =int(input("enter the number"))
    c= No_digits(num)
    print("Number of digits are" ,end=" ")
    print(c)

In()
