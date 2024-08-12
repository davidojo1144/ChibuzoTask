customer_name = input("What is the customer's name:\n ")
item = input("What did you buy?:\n ")
pieces = int(input("How many pieces:\n "))
unit = int(input("How much per unit:\n "))
while True:
	user_input = input("Add more items (answer by typing... yes/no): ")
	if user_input == 'yes':
		item2 = input("what did you buy?\n ")
		pieces2 = int(input("How many pieces:\n "))
		unit2 = int(input("How much per unit:\n "))

	elif user_input == 'no':
        	break 

	else:
		print("Invalid response! Please enter 'yes' or 'no'.")

cashier_name = input("what is your name?\n ")
discount = input("how much discount will he get:\n ")

total1 = pieces * unit
total2 = pieces2 * unit2

print()

print("SEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
print("TEL: 03293828343")
print("Date : 18-Dec-22 8:48:11 pm")
print(f"Cashier: {cashier_name}")
print(f"Customer Name: {customer_name}")
print("==================================================================")
print("\t\t\tITEMS \tQTY \tPRICE \tTOTAL(NGN)")
print("------------------------------------------------------------------")
print(f"\t\t\t{item} \n\t\t\t{item2}")
print(f"\t\t\t\t{pieces} \n\t\t\t\t{pieces2}") 
print(f"\t\t\t\t\t{unit} \n\t\t\t\t\t{unit2}")
print(f"\t\t\t\t\t\t{total1} \n\t\t\t\t\t\t{total2}") 

















	


