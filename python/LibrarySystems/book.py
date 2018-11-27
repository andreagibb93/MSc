class Book:
    def __init__(self, isbn, library_member, book_damages, title, author):
        self.isbn = isbn
        self.library_member = library_member
        self.book_damages = book_damages
        self.title = title
        self.author = author
    # This class represents a book

    def get_isbn(self):
        return self.isbn
    # Returns the book isbn

    def set_isbn(self, isbn):
        self.isbn = isbn
    # Sets isbn to given value

    def get_library_member(self):
        return self.library_member
    # Returns the library member

    def set_library_member(self, library_member):
        self.library_member = library_member
    # Sets the library member to the given member

    def get_damages(self):
        return self.book_damages
    # Return the book damages

    def set_damages(self, damages):
        self.book_damages += damages
    # Sets the damages and appends to list of damages

    def get_title(self):
        return self.title
    # Returns the book title

    def set_title(self, title):
        self.title = title
    # Sets title to given name

    def get_author(self):
        return self.author
    # Returns the book author

    def set_author(self, author):
        self.author = author
    # Sets author to given name

    def check_availability(self):
        if self.library_member is None:
            return True
        else:
            return False
    # Returns whether or not a book is available

    def print_book_details(self):
        print("ISBN: " + self.isbn)
        print("Damages " + self.book_damages)
        if self.library_member is not None:
            print("Borrowed by: " + self.library_member)
    # Prints all the details of a book (isbn, damage, library member)






