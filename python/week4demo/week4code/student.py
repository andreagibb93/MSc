#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 08:59:03 2018

@author: kl
"""

class Student:
    def __init__(self, name, stNo, m):
        self.name = name
        self.stNo = stNo
        self.m = m
        
    def setName(self, name):
        self.name = name
    
    def setStudentNo(self, stNo):
        if len(stNo) > 4:
            self.stNo = stNo
        else:
            print("The length of a student number must be greater than 4 characters!")
    
    def getName(self):
        return self.name