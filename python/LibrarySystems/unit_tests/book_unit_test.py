import unittest
from book import Book


class TestBook(unittest.TestCase):
# A unit test for class Book


    def test_get_set_isbn(self):
        test_book = Book("isbn", None, "", "title", "author")
        self.assertTrue(test_book.get_isbn() == test_book.isbn)

        self.assertTrue(test_book.isbn == "isbn")
        test_book.set_isbn("changed_isbn")
        self.assertTrue(test_book.isbn == "changed_isbn")
        # Test get and set for isbn

    def test_get_set_library_member(self):
        test_book = Book("isbn", None, "", "title" , "author")
        self.assertTrue(test_book.get_library_member() == test_book.library_member)

        self.assertTrue(test_book.library_member is None)
        test_book.set_library_member("changed_library_member")
        self.assertTrue(test_book.library_member == "changed_library_member")
        # Test get and set for library member

    def test_get_set_book_damages(self):
        test_book = Book("isbn", None, "", "title" , "author")
        self.assertTrue(test_book.get_damages() == test_book.book_damages)

        self.assertTrue(test_book.book_damages == "")
        test_book.set_damages("changed_book_damages")
        self.assertTrue(test_book.book_damages == "changed_book_damages")
        # Test get and set for book damages

    def test_get_set_title(self):
        test_book = Book("isbn", None, "", "title", "author")
        self.assertTrue(test_book.get_title() == test_book.title)

        self.assertTrue(test_book.title == "title")
        test_book.set_title("changed_title")
        self.assertTrue(test_book.title == "changed_title")
        # Test get and set for the title

    def test_get_set_author(self):
        test_book = Book("isbn", None, "", "title", "author")
        self.assertTrue(test_book.get_author() == test_book.author)

        self.assertTrue(test_book.author == "author")
        test_book.set_author("changed_author")
        self.assertTrue(test_book.author == "changed_author")
        # Test get and set for the author

    def test_get_availability(self):
        test_book = Book("isbn", None, "", "title", "author")
        self.assertTrue(test_book.check_availability() is True)

        test_book.library_member = "test_member"
        self.assertTrue(test_book.check_availability() is False)
        # Test if the book is available if library member is not currently borrowing

    def test_print_book_details(self):
        test_book = Book("isbn", None, "", "title", "author")
        test_book.print_book_details()
        # manual comparision needed, Prints all the details of a book (isbn, damage, library member, title, author)


if __name__ == '__main__':
    unittest.main()