#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 09:01:13 2018

@author: kl
"""

import unittest
from week4code.my_module import MyModule
from week4code.student import Student


class TestStudent(unittest.TestCase):
    """
    A test class for Student
    """

    def test_student_creation(self):
        """
            A test for student creation
        """
        m = MyModule(50)
        st = Student("K.Liaskos", "1234", m)
        self.assertEqual(st.getName(), "K.Liaskos")
        
    def test_set_student_no(self):
        """
            A test for setting student no
        """
        m = MyModule(50)
        st = Student("K.Liaskos", "1234", m)
        st.setStudentNo("567gdf8")
        self.assertEqual(st.stNo, "567gdf8")
#        
if __name__ == '__main__':
    unittest.main()