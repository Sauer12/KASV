from random import randint

number = randint(1, 100)
guess_number = 0
attempts = 0

while number != guess_number:
    guess_number = int(input("Hádaj číslo[od 1 do 100]: "))
    attempts += 1
    if guess_number < number:
        print("Hadaj väčšie číslo")
    elif guess_number > number:
        print("Hadaj menšie číslo")
    else:
        print("Blahoželám!")
        print("Uhadol si to na " + str(attempts) + " pokusov")