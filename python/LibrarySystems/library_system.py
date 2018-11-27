from book import Book
from electronic_resource import ElectronicResource


class LibrarySystem:
    def __init__(self, time_open, time_close ):
        self.electronic_resources = []
        self.books = []
        self.time_open = time_open
        self.time_close = time_close
    # This class represents the library system

    def get_electronic_resources(self):
        return self.electronic_resources
    # Returns the electronic resources in catalogue list

    def set_electronic_resources(self, library_resources):
        self.electronic_resources = library_resources
    # Sets electronic resources to given value

    def get_books(self):
        return self.books
    # Returns the books in catalogue list

    def set_books(self, books):
        self.books = books
    # Sets book in catalogue list

    def get_time_open(self):
        return self.time_open
    # Returns the library opening time

    def set_time_open(self, time_open):
        self.time_open = time_open
    # Sets library opening time to given time

    def get_time_close(self):
        return self.time_close
    # Returns the library closing time

    def set_time_close(self, time_close):
        self.time_close = time_close
    # Sets library closing time to given time

    def print_details(self):
        print("The opening time of the library is: " + str(self.time_open))
        print("The closing time of the library is: " + str(self.time_close))
        self.print_all_electronic_resource_details()
        self.print_all_book_details()
    # Prints the opening and closing details. Prints electronic resource and book details

    def check(self, resource):
        if resource in self.electronic_resources or resource in self.books:
            return True
        else:
            return False
    # Checks if electronic resources contains the resource

    def edit_title(self, resource, new_title):
        resource.title = new_title
    # Edits the title of the given resource

    def search_resource(self, resource):
        if resource in self.electronic_resources or resource in self.books:
            return resource
        else:
            return None
    # Searches the electronic resource & book list for given resource

    def search_isbn(self, isbn):
        total = 0
        for resource in self.books:
            if isbn == resource.isbn:
                total += 1
                resource.print_book_details()

        print(total)
    # Searches for resource using isbn value, prints total amount of found resources. Prints the book details

    def search_author(self, author):
        total = 0
        for resource in self.books:
            if author == resource.author:
                total += 1
                resource.print_book_details()

        print(total)
    # Searches for resource using author name, prints total amount of found authors and prints the book details

    def remove_resource(self, resource):
        if type(resource) is ElectronicResource:
            self.electronic_resources.remove(resource)
        else:
            self.books.remove(resource)
    # Removes a resource from the electronic resource & book list

    def remove_book_by_position(self, position):
        self.books.pop(position)
    # Removes a book from book by specific position

    def remove_electronic_resource_by_position(self, position):
        self.electronic_resources.pop(position)
    # Removes a electronic resource from the electronic resource by specific position

    def print_all_available(self):
        for resource in self.electronic_resources:
            if resource.get_available():
                resource.print_details()

        for book in self.books:
            if book.check_availability():
                book.print_book_details()
    # Returns all available items in the list book & electronic resource

    def get_number_resources(self):
        return len(self.electronic_resources) + len(self.books)
    # Returns the number of resources in the electronic resources & book

    def add_resource(self, resource):
        if resource in self.electronic_resources or resource in self.books:
            print("This resource is already in the library")
        if type(resource) == ElectronicResource:
            self.electronic_resources.append(resource)
        if type(resource) == Book:
            self.books.append(resource)
        else:
            print("I can only add books or electronic resources")
    # Adds a resource to the list, rejects resource if it already exists in the electronic resources & book

    def lend_book(self, book, library_member):
        if book in library_member.borrowed:
            print("You have already borrowed this book")
        elif book not in self.books:
            print("We don't have this book")
        elif not book.check_availability():
            print("This book is not available")
        elif len(library_member.borrowed) > 5:
            print("You have reached your book limit of 5 books borrowed")
        else:
            library_member.borrowed.append(book)
            book.library_member = library_member
    # Lends the book to a library member


    def return_book(self, book, damage_recorded, damage_description):
        if book not in self.books:
            print("This book is not in the library")
        else:
            book.library_member = None
            if damage_recorded:
                book.book_damages = damage_recorded
                book.book_damages = damage_description
    # Accepts a book return and records damages, if any

    def messages(self, message):
        for book in self.books:
            if book.library_member is not None:
                book.library_member.messages += message
    # Message sent to all library members currently holding books

    def print_all_book_details(self):
        for book in self.books:
            book.print_book_details()
    # Prints all details for book resources

    def print_all_electronic_resource_details(self):
        for resources in self.electronic_resources:
            resources.print_details()
    # Prints all details for electronic resources in resources















