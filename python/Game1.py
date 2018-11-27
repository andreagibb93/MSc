# Ecosystem Class

class Ecosystem:
    #Data here:
    def __init__(self, river, length):
        self.river = []
        self.length = length
        
    #Methods here:
    #Setters:
    def setLength(self, length):
        
        self.length = length
        
    #Getters:
    
    def getList(self):
        return self.name
    
    def createriver(self):
        
        for i in range(length):
            value = randint(0, 1)
            print(value)
            if value == 1:
                river.append(bear1)
            else value == 0:
                river.append(fish1)
        return river
        
      
    def collide(self):
        value = randint(0,1)
        if value == 0:
            print("Nothing happened! stay where it is")
        else value == 1:
            selection = randint(0,length)
            a = isinstance(river(selection), Bear)
            b = isinstance(river(selection+1), Bear)
            
            
            if a == b:
                print("Nothing happened! because they are of the same type")
                
            elif a != b:
                river.del(selection+1)
                
                
                
                print("Two of the same animal were detected, nothing happens")
            elif :
                
                
                
                  

class Bear:
    def__init__(self, strength)
    self.bear= []
    self.strength = 1
    
 class Fish:
    def__init__(self, strength)
    self.fish= []
    self.strength = 0
             
                  
from random import randint

bear1 = Bear()
fish1 = Fish()