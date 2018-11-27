class LibraryMember:
    def __init__(self, name, user_id, messages):
        self.name = name
        self.user_id = user_id
        self.borrowed = []
        self.messages = messages
    # This class represents a library member

    def get_name(self):
        return self.name
    # Returns the library member name

    def set_name(self, name):
        self.name = name
    # Sets name to given value

    def get_user_id(self):
        return self.user_id
    # Returns the library member's user id

    def set_user_id(self, user_id):
        self.user_id = user_id
    # Sets name to user id value

    def get_borrowed(self):
        return self.borrowed
    # Returns the books borrowed by library member

    def set_borrowed(self, borrowed):
        self.borrowed = borrowed
    # Sets books borrowed

    def get_messages(self):
        return self.messages
    # Returns the messages received

    def set_messages(self, messages):
        self.messages += messages
    # Sets messages received

    def print_user_details(self):
        print("The library member name: " + str(self.name))
        print("The library user ID is: " + str(self.user_id))
        print("The library member book(s) borrowed: " + str(self.borrowed))
        print("Messages received: " + str(self.messages))
    # Prints the details of library member

    def print_messages(self):
        print(self.messages)
    # Prints all the messages received by library member

    def add_book(self, book):
        self.borrowed.append(book)
    # Adds a borrowed book the list of borrowed books for the library member

    def print_books(self):
        for book in self.borrowed:
            book.print_book_details()
    # Prints all the details of books currently borrowed

    def get_number_borrowed(self):
        return len(self.borrowed)
    # Returns the number of borrowed books by a library member







