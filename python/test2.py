def main():
    print("This program illustrates a chaotic function")
    x = eval(input("Enter a number between 0 and 1: "))
    y = eval(input("Enter a number between 0 and 1: "))

    for i in range(10):
        x = 2.0 * x * (1 - x)
        y = 2.0 * y * (1 - y)
        print(x,y)


main()


# print("Hello, world!")
# print("Hello", "world!")
# print(3)
# print(3.0)
# print(2 + 3)
# print(2.0 + 3.0)
# print("2" + "3")
# print("2+3=",2+3)
# print(2 * 3)
# print(2 ** 3)
# print(11 / 4)
# print(11 // 4)

