z = int(input("Zadaj Z: "))
k = int(input("Zadaj K: "))

if z > k:
    k, z = z, k

for i in range(z, k+1):
    if i % 2 == 0:
        print(i)

