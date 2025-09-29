ucet = 100
while ucet > 0:
    vyber = float(input("Zadaj vyber: "))
    if vyber > ucet:
        print("Nemas dostatok prostriedkov")
    else:
        ucet = ucet - vyber
    print("Na ucet mas ", ucet)

