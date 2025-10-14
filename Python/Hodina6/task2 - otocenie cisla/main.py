number = int(input()) # 1234
new_number = 0

while number != 0:
    zvysok = number % 10
    new_number = (new_number * 10) + zvysok
    number = number // 10

print(new_number)