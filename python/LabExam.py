class FilmDirector:
    def __init__ (self):
        self.name = "default"
        self.age = -1
    # This class represents film Director

    def get_name(self):
        return self.name
    # get the name value

    def set_name(self, name):
        self.name = name
    # set the name value

    def get_age(self):
        return self.age
    # get the age value

    def set_age(self, age):
        self.age = age
    # set the age value


class DVD:
    def __init__(self, director):
        self.title = "default"
        self.director = director
        self.running_time = -1
    # This class represents DVD

    def get_title(self):
        return self.title
    # get the title value

    def set_title(self, title):
        self.title = title
    # set the title value

    def get_director(self):
        return self.director
    # get the director value

    def set_director(self, director):
        self.director = director
    # set the director value

    def get_running_time(self):
        return self.running_time
    # get the running_time value

    def set_running_time(self, running_time):
        self.running_time = running_time
    # set the running_time value

    def print_all_director_details(self):
        for director in self.director:
            director.print_director_details()

    def print_details(self):
        print("The title is: " + str(self.get_title()))
        print("The director is: " + str(self.get_director()))
        print("The running time is: " + str(self.get_running_time()))
        self.print_all_director_details()
    # a method to print details of DVD


class MyDVDCollection:
    def __init__(self):
        self.dvd = "defult"
        self.dvd_collection = []
    # This class represents a list of the dvd collection

    def get_dvd_collection(self):
        return self.dvd_collection

    # a method that takes book as parameter, and append
    def add_dvd_collection(self, dvd_collection):
        self.dvd_collection.append(dvd_collection)

    # a method to print all books in the list
    def print_dvd_collection(self):
        for dvd in self.dvd_collection:
            dvd.get_details()

    def check_dvd(self):
        for dvd in self.dvd:
            self.dvd = dvd
            print("This DVD is already in your collection!")
        else:
            print("DVD added successfully to your collection!")
    # This method uses a condition to add new dvd to list or discard

    def check_dvd_list(self):
        if len(li) == 0:
            print("DVD collection is empty!")
        else:
            print("DVD collection is not empty!")
    # Method to print for empty list

    def print_details(self):



# this test is for assessed task 4
def test():
    collection = MyDVDCollection()
    #creating MyDVDCollection object

    dvd1 = dvd_collection()
    dvd2 = dvd_collection()
    dvd3 = dvd_collection()

    collection.add_dvd_collection(dvd1)
    collection.add_dvd_collection(dvd2)
    collection.add_dvd_collection(dvd3)

    collection.print_dvd()

test()

# this test is for assessed task 5
def test():


