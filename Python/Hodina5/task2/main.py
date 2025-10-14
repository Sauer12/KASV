cislo = int(input())
ciferny_sucet = 0
zvysok = 0

while cislo != 0:
    zvysok = cislo % 10
    ciferny_sucet = ciferny_sucet + zvysok
    cislo = cislo // 10     # Celociselne delenie

print(ciferny_sucet)