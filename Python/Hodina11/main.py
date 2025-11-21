from uloha2 import *

inventar = [
    ["Chlieb", 20, 1.2],
    ["Jogurt", 150, 0.5],
    ["Čokoláda", 50, 1.5]
]

pridaj_produkt(inventar, "Jablká", 80, 0.2)
print("Inventár po pridaní:", inventar)

odstran_produkt(inventar, "Jogurt")
print("Inventár po odstránení:", inventar)

aktualizacia_mnozstva(inventar, "Čokoláda", 100)
print("Inventár po aktualizácii množstva:", inventar)

celkova_suma = celkova_hodnota(inventar)
print("Celkova suma inventára je:", celkova_suma)
inventar = [
    ["Chlieb" , 20, 1.2],
    ["Jogurt" , 150, 0.5],
    ["Čokoláda" , 50, 1.5]
]

print(najdi_produkt("Jogurt", inventar))
print(produkty_s_nizkym_mnozstvom(60, inventar))

# for produkt in inventar:
#     for polozka in produkt:
#         print (polozka)