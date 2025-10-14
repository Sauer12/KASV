number = int(input("Zadaj číslo, ktoré chceš otočiť: "))
output = 0

while number != 0:
    output = output * 10 + number % 10
    number = number // 10

print(output)