class Circle:
    def __init__(self, radius):
        self.radius = radius

    def get_radius(self):
        return self.radius

    # surface area = pi x radius to the power of 2
    # A = pi * r^2
    def get_surface(self):
        return 3.14 * self.radius * self.radius

    # volume = 4 / 3 * pi then radius to power of 3
    # V = (4/3) * pi * r^3
    def get_volume(self):
        return (4/3) * 3.14 * self.radius * self.radius * self.radius


class Cube:
    def __init__(self, edge):
        self.edge = edge

    def get_edge(self):
        return self.edge

    # surface = 6 times edge to power of 2
    # A = 6 * edge^2
    def get_surface(self):
        return 6 * self.edge * self.edge

    # volume is edge to power of 3
    # V = edge^3
    def get_volume(self):
        return self.edge * self.edge * self.edge


class BankAccount:
    def __init__(self):
        self.balance = 0.0

    # deposit amount into an account
    def deposit(self, amount):
        if amount < 0:
            print("Error, the amount deposited must be more than £0.00")
        else:
            self.balance += amount

    # withdraw the money from the account
    def withdraw(self, amount):
        if self.balance - amount > 0:
            self.balance -= amount
        else:
            print("Error, your account is overdrawn")

    def get_balance(self):
        return self.balance

    # transfer from one account and deposit into another
    def transfer(self, amount, account):
        self.withdraw(amount)
        account.deposit(amount)


circle_object = Circle(2)
print("Circle radius: " + str(circle_object.get_radius()))
print("Circle surface: " + str(circle_object.get_surface()))
print("Circle volume: " + str(circle_object.get_volume()))

cube_object = Cube(3)
print("Cube Edge: " + str(cube_object.get_edge()))
print("Cube surface: " + str(cube_object.get_surface()))
print("Cube volume: " + str(cube_object.get_volume()))

bank_account = BankAccount()
print("Bank balance: " + str(bank_account.get_balance()))
bank_account.deposit(400.00)
print("Bank balance after deposit: " + str(bank_account.get_balance()))
bank_account.withdraw(200.00)
print("Bank balance after withdraw: " + str(bank_account.get_balance()))


# transferring money between accounts
checking = BankAccount()
savings = BankAccount()

checking.deposit(500)
checking.transfer(200, savings)

print("Bank balance after deposit into savings account: " + str(checking.get_balance()))
print("Bank balance for savings account: " + str(savings.get_balance()))
