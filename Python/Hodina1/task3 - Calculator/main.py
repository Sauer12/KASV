operation = input("Zadaj operaciu (+ - * /): ")
number_one = int(input("Zadaj prvé číslo: "))
number_two = int(input("Zadaj druhé číslo: "))
result = 0

if operation == "+":
    result = number_one + number_two
    print("Výsledok je:", result)
elif operation == "-":
    result = number_one - number_two
    print("Výsledok je:", result)
elif operation == "*":
    result = number_one * number_two
    print("Výsledok je:", result)
elif operation == "/":
    if number_two == 0:
       print("Nulou sa nedá deliť")
    else:
       result = number_one / number_two
       print("Výsledok je:", result)
else:
    print("Neplatná operácia")
