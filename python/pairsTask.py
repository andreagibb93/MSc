class Assignment:
    def _init_(self, assignment1, assignment2):
        self.assignment = assignment1
        self.assignment = assignment2


class Module:
    def __init__(self, module1, module2, module3):
        self.module1 = module1
        self.module2 = module2
        self.module3 = module3


class Student:
    def _init_(self, name, stNo, maths, english, computing):
        self.name = name
        self.stNo = stNo
        self.maths = maths
        self.english = english
        self.computing = computing

    def setName(self, name):
        self.name = name

    def setStudentNo(self, stNo):
        self.stNo = stNo

    def setMaths(self, module1):
        self.maths = module1

    def setEnglish(self, module2):
        self.english = module2

    def setComputing(self, module3):
        self.computing = module3

    def getName(self):
        return self.name

    def getStudentNo(self):
        return self.stNo

    def getMaths(self):
        return self.maths

    def getEnglish(self):
        return self.english

    def getComputing(self):
        return self.computing

    def test():
        m = Module(10)
        st = Student("andrea", "1234", m)










