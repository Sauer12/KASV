def pridaj_produkt(zoznam, nazov, mnozstvo, cena):
    produkt = [nazov, mnozstvo, cena]
    zoznam.append(produkt)

def odstran_produkt(zoznam, nazov):
    for produkt in zoznam:
        if produkt[0] == nazov:
            zoznam.remove(produkt)
            break  # aby sa to nespustilo viackrát

def aktualizacia_mnozstva(zoznam, nazov_produktu, nove_mnozstvo):
    for produkt in zoznam:
        if produkt[0] == nazov_produktu:
            produkt[1] = nove_mnozstvo  # priradenie, nie porovnanie

def celkova_hodnota(zoznam):
    celkova_suma_inventara = 0
    for produkt in zoznam:
        celkova_suma_inventara += produkt[1] * produkt[2]
    return celkova_suma_inventara

def najdi_produkt(nazov, zoznam):
    for produkt in zoznam:
        if(produkt[0] == nazov):
            return produkt[2]

def produkty_s_nizkym_mnozstvom(hranica, zoznam):
    pomocny_zoznam = []
    for produkt in zoznam:
        if(produkt[1] < hranica):
            pomocny_zoznam.append(produkt)
    return pomocny_zoznam
