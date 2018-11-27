import unittest
from library_member import LibraryMember
from book import Book

class TestLibraryMember(unittest.TestCase):
    # A unit test for class library member

    def test_get_set_name(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        self.assertTrue(test_library_member.get_name() == test_library_member.name)

        self.assertTrue(test_library_member.name == "name")
        test_library_member.set_name("changed_name")
        self.assertTrue(test_library_member.name == "changed_name")
        # Test get and set for name change

    def test_get_set_user_id(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        self.assertTrue(test_library_member.get_user_id() == test_library_member.user_id)

        self.assertTrue(test_library_member.user_id == "user_id")
        test_library_member.set_user_id("changed_user_id")
        self.assertTrue(test_library_member.user_id == "changed_user_id")
        # Test get and set for user Id change

    def test_get_set_borrowed(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        self.assertTrue(test_library_member.get_borrowed() == test_library_member.borrowed)

        self.assertTrue(test_library_member.borrowed == [])
        test_library_member.set_borrowed(["Test List"])
        self.assertTrue(test_library_member.borrowed == ["Test List"])
        # Test set and set for borrowed book

    def test_get_set_messages(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        self.assertTrue(test_library_member.get_messages() == test_library_member.messages)

        self.assertTrue(test_library_member.messages == "messages")
        test_library_member.set_messages("changed_messages")
        self.assertTrue(test_library_member.messages == "messageschanged_messages")
        # Test get and set for messages

    def test_print_user_details(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        test_library_member.print_user_details()
        # manual comparision needed. Prints name, user ID, borrowed, messages

    def test_print_messages(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        test_library_member.print_messages()
        # Test message has been received by user


    def test_add_book(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        test_book = Book("isbn", None, "damages", "title", "author")

        self.assertTrue(test_library_member.borrowed ==[])
        test_library_member.add_book(test_book)
        self.assertTrue(test_library_member.borrowed[0] == test_book)
        # Test adding a book to the library member borrowed list


    def test_print_books(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        test_book = Book("isbn", None, "damages", "title", "author")
        test_library_member.add_book(test_book)

        test_library_member.print_books()
        # manual comparison needed. Prints all the details of books currently borrowed

    def test_get_number_borrowed(self):
        test_library_member = LibraryMember("name", "user_id", "messages")
        test_book = Book("isbn", None, "damages", "title", "author")

        self.assertTrue(test_library_member.get_number_borrowed() == 0)
        test_library_member.add_book(test_book)
        self.assertTrue(test_library_member.get_number_borrowed() == 1)
        # Tests number of books borrowed by a library member


if __name__ == '__main__':
    unittest.main()