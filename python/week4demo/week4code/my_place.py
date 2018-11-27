#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 08:58:50 2018

@author: kl
"""

class MyPlace:
    def __init__(self):
        self.studentList = []

    def addStudent(self, st):
        self.studentList.append(st)
    
    def getStudentList(self):
        return self.studentList
    
    def printListDetails(self):
        print("Total number of students: " + str(len(self.studentList)))
        print("Student names: ")
        if len(self.studentList) != 0:
            for student in self.studentList:
                print(student.getName())
        else:
            print("Student list is empty.")