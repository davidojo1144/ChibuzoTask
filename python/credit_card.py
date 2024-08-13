card_details = input("Enter your credit card details: ")
numbers = [int(num)for num in card_details] 
if(len(numbers) < 13 or len(numbers) > 16):
	print("Card Invalid")

else :

	print()

	print("***************************************************************")

	if numbers[0] == 4 :
		print("**Credit Card Type: VisaCard")

	elif numbers[0] == 5 :
		print("**Credit Card Type: MasterCard")

	elif numbers[0] == 6 :
		print("**Credit Card Type: Discover Card")

	elif numbers[0] == 3 and numbers[1] == 7 :
		print("**Credit Card Type:  American Express Card")

	else:
		print("**Credit Card Type: Invalid Card Type")
	
	total = 0
	odd_value = 0

	for digit in range (len(numbers) -2, -1, -2) :
		second_num = numbers[digit] * 2 
		if(second_num > 9):
			second_num = second_num % 10 + second_num // 10
		total = total + second_num

	for indexes in range (len(numbers) -1, 0, -2) :
		odd_value = odd_value + numbers[indexes] 

	sum = odd_value + total


	print("**Credit Card Number: ", card_details)
	print("**Credit Card Digit Length: ", len(numbers))

	if sum % 10 == 0 :
		print("**Credit Card Validity Status: valid")
	else:
		print("**Credit Card Validity Status: invalid")

	print("***************************************************************")


