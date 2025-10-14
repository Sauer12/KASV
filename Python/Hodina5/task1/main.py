import random

stastne_cislo = random.randint(1, 100)
print(stastne_cislo)

if ((stastne_cislo % 3 == 0 or stastne_cislo % 4 == 0)
        and (stastne_cislo % 5 != 5 and stastne_cislo % 10 != 0)):
    print("Toto cislo je stastne: " + str(stastne_cislo))

