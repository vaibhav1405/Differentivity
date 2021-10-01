def pal(n):
    if (str(n) == str(n)[::-1]):
        return n
    else:
        n=n+1
        return pal(n)


num=int(input("enter the no. of test cases"))
for i in range(0,num):
    print("enter element ",i)
    ele=int(input())
    ans=pal(ele)
    print(f"next palindrome to {ele} is {ans}")
