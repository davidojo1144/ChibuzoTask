from datetime import datetime, timedelta

user_name = input("Whats your name: ")
print(f"Welcome Mrs/Miss {user_name}")
print("Welcome to VisionPro menstruation App. \nWe are here to serve you.")
print("==============================================================================================================")

next_menses = input("Enter your previous menstral cycle(using this format yyyy-mm-dd):\n ")
menstrual_cycle_length = 28
ovulation = 14
my_date_format = "%Y-%m-%d"
date_started = datetime.strptime(next_menses, my_date_format)
	
delta1 = timedelta(menstrual_cycle_length)
next_menstrual = date_started + delta1
print("Your next menstrual cycle is on: ", next_menstrual)
print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

print()

safe_period = 7
delta2 = timedelta(safe_period)
safe_period = next_menstrual - delta2 
print("Your safe period is: ", safe_period)
print(f"So you can have sex on {safe_period} without any protection or contraceptive pills")
print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

print()

	
while True:
	user_input = input("would you love to continue or you'd love to check some other time(Reply with a yes or no): ")
	if user_input == "yes" or user_input == "YES" :
		user_flow_period = int(input("How long is your flow period:\n "))
		delta3 = timedelta(user_flow_period)
		flow_period = next_menstrual + delta3
		print("Your next menstrual cycle would end on: ", flow_period)
		print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

		print()

		user_ovulation = int(input("How many days is your ovulation period:\n "))
		delta4 = timedelta(user_ovulation)
		delta5 = timedelta(ovulation)
		gotten_ovulation = delta4 + delta5
		ovulation_period = next_menstrual - gotten_ovulation
		print("Your next ovulation should be around: ", ovulation_period)
		print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

	elif user_input == "no" or user_input == "NO" :
		break

	else:
		print("invalid command! please type (yes or no)")
print("==============================================================================================================")
print("==============================================================================================================")




	

			


	







