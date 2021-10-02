a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))
c = input("Enter the operator: ")

if c == '+' or c == 'add':
	print("Output: " + str(a + b))
elif c == '-' or c == 'subtract':
	print("Output: "+ str(a - b))
elif c == '*' or c == 'multiply':
	print("Output: "+ str(a * b))
elif c == '/' or c == 'divide':
	print("Output: "+ str(a / b))
else:
	print("Some Error Occured!")