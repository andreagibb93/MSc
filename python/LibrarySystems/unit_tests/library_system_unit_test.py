import unittest
from library_system import LibrarySystem
from library_member import LibraryMember
from book import Book
from electronic_device import ElectronicDevice
from electronic_resource import ElectronicResource

class TestLibrarySystem(unittest.TestCase):
    # A unit test for class library system

    def test_get_set_electronic_resources(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        self.assertTrue(test_library_system.get_time_open() == test_library_system.time_open)

        self.assertTrue(test_library_system.electronic_resources == [])
        test_library_system.set_electronic_resources(["Test List"])
        self.assertTrue(test_library_system.electronic_resources == ["Test List"])
        # Test get and set for electronic resources


    def test_get_set_books(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        self.assertTrue(test_library_system.get_time_open() == test_library_system.time_open)

        self.assertTrue(test_library_system.books == [])
        test_library_system.set_books(["Test List"])
        self.assertTrue(test_library_system.books == ["Test List"])
        # Test get and set for books

    def test_get_set_time_open(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        self.assertTrue(test_library_system.get_time_open() == test_library_system.time_open)

        self.assertTrue(test_library_system.time_open == "time_open")
        test_library_system.set_time_open("changed_time")
        self.assertTrue(test_library_system.time_open == "changed_time")
        # Test get and set for opening times

    def test_get_set_time_close(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        self.assertTrue(test_library_system.get_time_open() == test_library_system.time_open)

        self.assertTrue(test_library_system.time_close == "time_close")
        test_library_system.set_time_close("changed_time")
        self.assertTrue(test_library_system.time_close == "changed_time")
        # Test get and set for closing times

    def test_print_details(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_library_system.print_details()
        # Manual comparison needed. Prints the opening and closing details. Prints electronic resource and book details

    def test_check(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_electronic_resource = ElectronicResource()

        self.assertTrue(test_library_system.check(test_electronic_resource) == False)

        test_library_system.add_resource(test_electronic_resource)

        self.assertTrue(test_library_system.check(test_electronic_resource))
        # Test checks if electronic resources contains the resource

    def test_edit_title(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, 'damages', 'title', 'author')
        
        self.assertTrue(test_book.title == 'title')
        test_library_system.edit_title(test_book, 'new title')
        self.assertTrue(test_book.title == 'new title')
        # test checks that edit, edits the title of the given resource

    def test_search_resource(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_electronic_resource = ElectronicResource()

        self.assertTrue(test_library_system.search_resource(test_electronic_resource) is None)

        test_library_system.add_resource(test_electronic_resource)

        self.assertTrue(test_library_system.search_resource(test_electronic_resource) == test_electronic_resource)
        # Test searches electronic resource list for given resource

    def test_search_isbn(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, 'damages', 'title', 'author')

        test_library_system.add_resource(test_book)
        test_library_system.search_isbn("isbn")
        # Test searches for resource using isbn value

    def test_search_author(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, 'damages', 'title', 'author')
        test_library_system.add_resource(test_book)

        test_library_system.search_author('author')
        # Test searches for resource using author name

    def test_remove_resource(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, 'damages', 'title', 'author')

        test_library_system.add_resource(test_book)
        self.assertTrue(test_library_system.books == [test_book])
        test_library_system.remove_resource(test_book)
        self.assertTrue(test_library_system.books == [])
        # Tests removing a book from the book list

    def test_remove_resource_by_position(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_resource = ElectronicResource()

        test_library_system.add_resource(test_resource)
        self.assertTrue(test_resource in test_library_system.electronic_resources)
        test_library_system.remove_electronic_resource_by_position(0)
        self.assertTrue(test_library_system.electronic_resources == [])
        # Tests removing electronic resource by specific position in list

    def test_remove_book_by_position(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, 'damages', 'title', 'author')

        test_library_system.add_resource(test_book)
        self.assertTrue(test_library_system.books == [test_book])
        test_library_system.remove_book_by_position(0)
        self.assertTrue(test_library_system.books == [])
        # Tests removing book by specific position in list

    def test_print_all_available(self):
        test_library_system = LibrarySystem("time_open", "time_close")

        test_library_system.print_all_available()
        # manual comparison needed. Prints all available items in the list book & electronic resource

    def test_get_number_resources(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, "damages", "title", "author")

        self.assertTrue(test_library_system.get_number_resources() == 0)
        test_library_system.add_resource(test_book)
        self.assertTrue(test_library_system.get_number_resources() == 1)
        # Tests number of books in resource list

    def test_add_resource(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, "damages", "title", "author")

        test_library_system.add_resource(test_book)
        self.assertTrue(test_book in test_library_system.books)
        # Test adding a book to the library resource

    def test_lend_book(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, "damages", "title", "author")
        test_library_member = LibraryMember("name", "user_id", "messages")

        test_library_system.add_resource(test_book)
        test_library_system.lend_book(test_book, test_library_member)
        self.assertTrue(test_book in test_library_member.borrowed)
        self.assertTrue(test_book.library_member == test_library_member)
        # Test lending a book to a library member


    def test_return_book(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, "damages", "title", "author")
        test_library_member = LibraryMember("name", "user_id", "messages")

        test_library_system.add_resource(test_book)
        test_library_system.lend_book(test_book, test_library_member)
        self.assertTrue(test_book in test_library_member.borrowed)
        self.assertTrue(test_book.library_member == test_library_member)

        test_library_system.return_book(test_book, False, "")
        self.assertTrue(test_book.library_member is None)
        # Test library member returning a book


    def test_messages(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, "damages", "title", "author")
        test_library_member = LibraryMember("name", "user_id", "messages")

        test_library_system.add_resource(test_book)
        test_library_system.lend_book(test_book, test_library_member)
        self.assertTrue(test_book in test_library_member.borrowed)
        self.assertTrue(test_book.library_member == test_library_member)

        test_library_system.messages("test")
        self.assertTrue(test_library_member.messages == "messagestest")
        # Test Message sent to all library members currently holding books

    def test_print_all_book_details(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_book = Book("isbn", None, "damages", "title", "author")
        test_library_system.add_resource(test_book)

        test_library_system.print_all_book_details()
        # manual comparison needed. Prints all details for book resources


    def test_print_all_electronic_resource_details(self):
        test_library_system = LibrarySystem("time_open", "time_close")
        test_electronic_resources = ElectronicResource()
        test_library_system.print_all_electronic_resource_details()

        test_electronic_resources.print_details()
        # manual comparison needed. Prints all details for electronic resources in resources


if __name__ == '__main__':
    unittest.main()
