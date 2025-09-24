a = int(input("Zadaj číslo a: "))
b = int(input("Zadaj číslo b: "))
c = int(input("Zadaj číslo c: "))

if a == b == c:
    print("Rovnostranný")
elif a == b or b==c or a==c:
    print("Rovnoramenný")
elif a + b > c and a + c > b and b + c > a:
    print("Rôznostranný")
else:
    print("Trojuholník sa nedá zostrojiť")
