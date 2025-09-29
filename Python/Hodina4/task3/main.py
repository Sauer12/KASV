import random

pocet_pokusov = 0

while True:
    number = random.randint(1, 6)
    pocet_pokusov += 1
    print(number)
    if number == 6:
        print("Počet pokusov: " + str(pocet_pokusov))
        break
