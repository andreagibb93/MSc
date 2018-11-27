from random import randint

class Fish:
    pass

class Bear:
    def __init__(self):
        self.strength = randint(0, 5)

# array of fish/bears
river = []
river_size = 5

# randomly generate fish or bear
for i in range(river_size):
    if randint(0, 1) == 0:
        river.append(Fish())
    else:
        river.append(Bear())

# if two classes are the same, print same. or pop out a fish
def step():
    random_number = randint(0, len(river) - 1)
    if river[random_number].__class__ == river[random_number + 1].__class__:
        print("Same class")
        if isinstance(river[random_number], Bear):
            if river[random_number].strength > river[random_number+1].strength:
                river.pop(random_number + 1)
            else:
                river.pop(random_number)

    else:
        if isinstance(river[random_number], Bear):
            river.pop(random_number + 1)

        else:
            river.pop(random_number)


for i in range(10):
    if len(river) == 1:
        break
    else:
        print(river)
        step()

print(river)
