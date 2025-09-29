import random

pocet_cyklov = 0
while True:
    number = random.randint(1, 100)
    pocet_cyklov += 1
    if number % 2 == 0:
        print(number)
        if number == 42:
            break

print("Pocet cyklov: " + str(pocet_cyklov))