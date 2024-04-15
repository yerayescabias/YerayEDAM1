from Model import *
from BasicMethod import *
class Student(Person):
    
    def init(self,id,sn,mv,gr):
        super().__init__(id,sn,mv)
        self.gr=gr
        
    def setGrade(self):
        self.gr = BasicMethods.askinteger("grade")
        
        
    def getGrade(self):
        return self.gr
    
    
    def __str__(self):
        return 'Student [id=' + (self.id) + ', name=' + self.name + ', surname=' + self.surname + ', movile=' + self.mv + ', grade=' + self.gr + ']'