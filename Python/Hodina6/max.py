number = int(input())
max = 0

while number != 0:
    result = number % 10
    if (max < result):
        max = result
    number = number // 10

print(max)

# toto je princip podmienky
# print(155 // 10)
# print(15 // 10)
# print(1 // 10)