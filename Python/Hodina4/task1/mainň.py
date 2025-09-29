count = 10
while count >= 0:
    print(count)
    inp = input("Chceš pokračovať?: ")
    if inp == "stop":
        break
    count -= 1

print("Vykonávanie ukončené")