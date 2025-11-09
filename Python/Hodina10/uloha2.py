def pridaj_produkt(zoznam, nazov, mnozstvo, cena):
    produkt = [nazov, mnozstvo, cena]
    zoznam.append(produkt)

def odstran_produkt(zoznam, nazov):
    for produkt in zoznam:
        if produkt[0] == nazov:
            zoznam.remove(produkt)

def zmena_nazvu(zoznam, stary_nazov, novy_nazov):
    for produkt in zoznam:
        if produkt[0] == stary_nazov:
            produkt[0] = novy_nazov


inventar = [
    ["Chlieb", 20, 1.50],
    ["Jogurt", 150, 0.50],
    ["Čokoláda", 50, 1.50]
]


pridaj_produkt(inventar, "Jablko", 80, 0.20)
odstran_produkt(inventar, "Jogurt")
zmena_nazvu(inventar,"Chlieb", "Rožok")

print(inventar)

# for produkt in inventar:
#     for polozka in produkt:
#         print(polozka)

