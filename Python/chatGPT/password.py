heslo = input("Zadaj heslo: ")
chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
nums = "0123456789";
characters = 0
numbers = 0

for i in range(len(chars)):
    if len(chars) < 8:
        print("Heslo musí mať aspoň 8 znakov")
        break
    elif chars[i] in chars:
        characters += 1
    elif chars[i] in nums:
        numbers += 1

if characters >= 7 and numbers >= 1:
    print("Správne heslo")
else:
    print("Nesprávne heslo")