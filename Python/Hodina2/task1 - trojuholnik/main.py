a = int(input("Zadaj číslo strany a: "))
b = int(input("Zadaj číslo strany b: "))
c = int(input("Zadaj číslo strany c: "))

if a + b > c and a + c > b and b + c > a:
    print("Trojuholník s danými stranami existuje")
else:
    print("Trojuholník s danými stranami neexistuje")