uhol = int(input("Zadaj uhol: "))

if 0 < uhol <= 90:
    print("Ostrý uhol")
elif uhol == 90:
    print("Pravý uhol")
elif 90 < uhol < 180:
    print("Tupý uhol")
else:
    print("Priamy uhol")