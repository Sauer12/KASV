# FizzBuzz - prvá úloha
for i in range(1, 21):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz");
    else:
        print(i)

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

names = ["Lukas", "Anna", "Peter", "Marek"]
for name in names:
    if name[0] == "A":
        print(name)

def reverse_string(s):
    o = ""
    for i in range(len(s) - 1, -1, -1):
        o += s[i]
    return o

students = {"Lukas": 25, "Anna": 22, "Peter": 24}
for student in students.items():
    print(f"Meno: {student[0]}, Vek: {student[1]}")

class Car:
    def __init__(self, brand, year):
        self.brand = brand;
        self.year = year;

car = Car("BMW", 2022)
print(car.brand)
print(car.year)

def f(n):
    if n == 1:
        return 1
    else:
        return n * f(n - 1)

print(f(5))

def fibo(n):
    l = [1, 1]
    for i in range(n):
        l.append(l[i] + l[i + 1])

    return l[n - 2]

print(fibo(10))

def w(text):
    words = text.split(" ")
    return len(words)
