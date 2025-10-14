number = int(input())

max = 0
zvysok = 0
while number != 0:
    zvysok = number % 10
    if zvysok > max:
        max = zvysok
    number = number // 10

print(max)