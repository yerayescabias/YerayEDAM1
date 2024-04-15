class Person:
    
    def __init__(self,id,name,surname,email):
        self.id=id
        self.name=name
        self.surname=surname
        self.email=email
    
    def setID(self,id):
        self.id=id
    
    def getID(self):
        return self.id
    
    def setName(self,name):
        self.name=name
    
    def getName(self):
        return self.name
    
    def setSurnmae(self,surname):
        self.surname=surname
    
    def getSurname(self):
        return self.surname
    
    def setEmail(self,email):
        self.email=email
    
    def getEmail(self):
        return self.email
    
    def __str__(self):
        return "name="+self.name+" surname="+self.surname+" email"+ self.email
    