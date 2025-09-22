u = int(input("Zadaj uhol: "))

if 0 < u <= 90:
    print("Ostrý uhol")
elif u == 90:
    print("Pravý uhol")
elif 90 < u < 180:
    print("Tupý uhol")
else:
    print("Priamy uhol")