price = float(input("Zadaj cenu produktu: "))
discount = float(input("Zadaj veľkosť zľavy v %: "))

discount_price = price - (price * discount/100)
print(f"Cena s zľavou: {discount_price:.2f} €")

