def add_four_numbers(a, b, c, d):
    # Add the four numbers
    total = a + b + c + d
    return total

# Input four numbers from the user
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))
num4 = float(input("Enter the fourth number: "))

# Call the function to add the numbers
result = add_four_numbers(num1, num2, num3, num4)

# Display the result
print("The sum of the four numbers is:", result)
