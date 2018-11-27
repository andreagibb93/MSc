class Assignment:
    def __init__(self, name, mark):
        self.name = name
        self.mark = mark
    #parameters are defined because

    def getName(self):
        return self.name

    def getMark(self):
        return self.mark

    def setMark(self, mark):
        self.mark = mark


class Module:
    def __init__(self, name):
        self.name = name
        self.assignmentList = []

    def addAssignmentList(self, st):
        self.assignmentList.append(st)

    def getAssignmentList(self):
        return self.assignmentList

    def getName(self):
        return self.name

    def printListDetails(self):
        print ("total number of assignments" + str(len(self.assignmentList)))
        print ("assignment names: ")
        if len(self.assignmentList) != 0:
            for assignment in self.assignmentList:
                print (assignment.getName())
        else:
                print("assignment list is empty.")

class Student:
    # def __init__(self, name, stNo, module1, module2, module3):
    def __init__(self, name, stNo,):
        self.name = name
        self.stNo = stNo
        self.moduleList = []
        # self.module1 = module1
        # self.module2 = module2
        # self.module3 = module3

    def addModuleList(self, module):
            self.moduleList.append(module)

    def getModuleList(self):
            return self.moduleList

    def getName(self):
        return self.name

    def printListDetails(self):
            print("total number of mods" + str(len(self.moduleList)))
            print("mod names: ")
            if len(self.moduleList) != 0:
                for Module in self.moduleList:
                    print(Module.getName())
            else:
                print("mod list is empty.")



    def getName(self):
        return self.name

    def setName(self, name):
        self.name = name

    def getStNo(self):
        return self.stNo

    def setStNo(self, stNo):
        self.stNo = stNo


def test():
    a1 = Assignment("Class Test 1", 50)
    a2 = Assignment("Class Test 2", 60)
    a3 = Assignment("Class Test 3", 10)
    m1 = Module("CS1")
    m2 = Module("CS2")
    st1 = Student("andrea", "6586")

    m1.addAssignmentList(a1)
    m1.addAssignmentList(a2)
    m1.addAssignmentList(a3)

    st1.addModuleList(m1)
    st1.addModuleList(m2)
    m1.printListDetails()
    st1.printListDetails()

    # m2 = Module("CS2",a1, a2)
    # m3 = Module("CS3", a1, a2)
    # st1 = Student("Student1", 1111, m1, m2, m3)

    # print(st1.name)


#
#
# def test1():
#     module = Module(50)
#     module.addAssignmentList()
#
#
#
#
#     print(assignmentList)




test()
