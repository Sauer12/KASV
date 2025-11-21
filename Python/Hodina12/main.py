student1 = ('Peter', 1, 4, 2, 1)
student2 = ('Jozef', 2, 1, 2, 2)
student3 = ('Pavol', 1, 1, 2, 1)

print(type(student1))
students = [student1, student2, student3]

def list_students(studentsList):
    for student in studentsList:
        print(student[0])

list_students(students)

def average_grade(students: list):
    averages = [] #pole
    for student in students:
        name = student[0]
        grades = student[1:]
        avg = sum(grades)/len(grades)
        studentTuple = (name, avg)
        averages.append((studentTuple))
    return averages

print(average_grade(students))

def best_student(students: list):
    averages = average_grade(students)
    min = 6
    name = ""
    for student in averages:
        if(student[1] < min):
            min = student[1]
            name = student[0]

    return name

print(best_student(students))

def add_student(students: list, student: tuple):
    students.insert(1, student)

new_student = ("Monika", 1, 1, 1)
add_student(students, new_student)

list_students(students)