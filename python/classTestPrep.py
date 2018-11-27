#The class represents a book
class Book:
    def __init__(self):
        self.stock_number = -1
        self.author = "default"
        self.title = "default"
        self.price = -1.00
        self.number_of_pages = 0
        #do not need parameters inside ()

#get and set values
    def get_stock_number(self):
        return self.stock_number

    def get_author(self):
        return self.author
#returns the author of the book

    def get_title(self):
        return self.title

    def get_price(self):
        return self.price

    def get_number_of_pages(self):
        return self.number_of_pages

    def set_stock_number(self, stock_number):
        self.stock_number = stock_number
        # sets the book's stock number

    def set_author(self, author):
        self.author = author

    def set_title(self, title):
        self.title = title

#the set method will reject negative values by using a condition
    def set_price(self, price):
        if price >= 0:
            self.price = price
        else:
            print("Error, this is a negative price value")

    def set_number_of_pages(self, number_of_pages):
        self.number_of_pages = number_of_pages

#using concatenation for print statement
    def print_details(self):
        print("The stock number is: " + str(self.get_stock_number()))
        print("The author is: " + str(self.get_author()))
        print("The title is: " + str(self.get_title()))
        print("The price is: " + str(self.get_price()))
        print("The number of pages are: " + str(self.get_number_of_pages()))

#new class that holds list of book objects
class BookCatalogue:
    def __init__(self):
        self.books = []

    # method to return the list data field
    def get_books(self):
        return self.books

    # a method that takes book as parameter, and append
    def add_book(self, book):
        self.books.append(book)

    # a method to print all books in the list
    def print_books(self):
        for book in self.books:
            book.get_details()



# adds 3 books to catalogue & prints details of all books
def test():
    catalogue = BookCatalogue()
    #creating bookcatalogue object

    book1 = Book()
    book2 = Book()
    book3 = Book()

    catalogue.add_book(book1)
    catalogue.add_book(book2)
    catalogue.add_book(book3)

    catalogue.print_books()

test()