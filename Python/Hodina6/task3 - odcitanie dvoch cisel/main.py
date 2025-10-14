# number = int(input())
# divisor = int(input())
#
# output_number = 0
#
# while number > 0:
#     number -= divisor
#     output_number += 1
#
# if number % divisor != 0:
#     output_number -= 1
#
# print(output_number)

print(125 % 10)
print(126//10)
print(12//10)

cislo = int(input())
max = 0

while cislo != 0:
    n = cislo % 10
    if max < n:
        max = n
    cislo = cislo // 10

print(max)
