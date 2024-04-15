import csv
import datetime
from datetime import * 

def append_patients(id,name,sname,tlf,prov,disease,type,idStaff):
    patients=open ('Patients.csv','a')

    with patients:
        names=['Id_Patients','Name','Surname','Telephone','Provenance','Disease','Type','Id_Staff']
        append=csv.DictWriter(patients,fieldnames=names)      
        append.writerow({'Id_Patients':id,'Name':name,'Surname':sname,'Telephone':tlf,'Provenance':prov,'Disease':disease,'Type':type,'Id_Staff':idStaff})
            
def visualize_patients():
    
    patients=open ('Patients.csv','r')
    with patients:
        reader=csv.DictReader(patients)
        for row in reader:
            print (row)

def search_patients(paid,patwlist,auker):
    
    patients=open('Patients.csv','r')
    with patients:
        reader=csv.DictReader(patients)
        if(auker==0):
            i=0
            while( i<len(patwlist)):
                    patients.seek(0)
                    for row in reader:
                        out=True
                        if(patwlist[i]==row["Provenance"] and out):
                            print(row)
                            out=False
                        
                    i=i+1
                                
        elif(auker==1):
            for row in reader:
                if(row["Id_Patients"]==paid):
                    print(row)
                    break

        
def patient_menu():
  select_patient=0
  repeat_patient= "y"
  while repeat_patient=="y" or repeat_patient=="Y":
        print("=========================")
        print("=     Patients Menu     =")
        print("=========================")
        print("  0.Exit\n  1.Add \n  2.Visualize\n  3.Search")
        print("=========================")
        
        select_patient=(int(input("Select the option from 0-3:")))
        
        if select_patient==0:
            break
        
        elif select_patient==1:
            continues="y"
            while continues=="y" or continues=="Y":
                id=(input("Enter the Id of the patient: "))
                name=(input("Enter the first name: "))
                sname=(input("Enter the last name: "))
                tlf=(input("Enter the telephone number: "))
                prov=(input("Enter the Provenance: "))
                disease=(input("Enter the Disease: "))
                type=(input("Enter if it is a patient or a familiar: "))
                idStaff=(input("Enter the Id of the staff: "))
                continues=(input("Do you want to continue (Y/N): "))

            append_patients(id,name,sname,tlf,prov,disease,type,idStaff)
            repeat_patient=input("Do you want to go back to the patients menu?(Y/N) ")
            
        elif select_patient==2:
            visualize_patients()
            repeat_patient=input("Do you want to go back to the patients menu?(Y/N)")
            
        elif select_patient==3:
            patwlist=[]
            paid=""
            auker_patient=(int(input("Do you want to search multipletowns(0) or only one ID(1)")))
            if(auker_patient==0):
                    
                    maxim=(int(input("How many towns you want to find?")))
                    while(maxim>0):
                        paid_ak=(input("Enter the town name: "))
                        maxim=maxim-1
                        patwlist.append(paid_ak)
            elif(auker_patient==1):
                    paid=(input("Enter the ID of the patient yo want to search: "))
                
            else:
                    print("wrong number")
            search_patients(paid,patwlist,auker_patient)
            repeat_patient=input("Do you want to go back to the patients menu?(Y/N) ")
        
        else:
            print("\nxxxxxxxxxxxxxxxxxxxxx\n Wrong number\nxxxxxxxxxxxxxxxxxxxxx\n")
            repeat_patient="y"
                
def append_staff():
    with open('STAFF.csv', 'a', newline='') as d:
        fields = ['Staff_Id', 'Staff_Name', 'Surname', 'Gmail', 'Type']
        writer = csv.DictWriter(d, fieldnames=fields)

        id_input = input("Enter the Id: ")
        fname = input("Enter the first name: ")
        lname = input("Enter the last name: ")
        gmail = input("Enter the mail: ")
        staff_type = input("Choose the type (Doctor, Psychologist, etc.): ")
        
        writer.writerow({'Staff_Id': id_input, 'Staff_Name': fname, 'Surname': lname, 'Gmail': gmail, 'Type': staff_type})

def read_staff():
    with open('STAFF.csv', 'r') as d:
        reader = csv.DictReader(d)
        print("Staff Information:")
            
        for row in reader:
            print(row)

def search_staff():
    tosearch = input("Enter search term: ")
    with open('STAFF.csv', 'r') as d:
        reader = csv.DictReader(d)
        print("Search Results:")
        found = False
        for row in reader:
            if tosearch in row.values():
                print(row)
                found = True
        if not found:
            print("No results found for the search term:", tosearch)
def staff_menu():
    repeat_staff = "y"
    while repeat_staff == "y" or repeat_staff == "Y" :
        print("======================")
        print("=     Staff Menu     =")
        print("======================")
        print("  0.Exit\n  1.Add \n  2.Visualize\n  3.Search")
        print("======================")
        
        select_Staff = int(input("Select the option from 0-3: "))
        
        if select_Staff == 0:
            break
        elif select_Staff== 1:
            append_staff()
        elif select_Staff == 2:
            read_staff()
        elif select_Staff== 3:
            search_staff()
        else:
            print("\nxxxxxxxxxxxxxxxxxxxxx\n Wrong option\nxxxxxxxxxxxxxxxxxxxxx\n")

        repeat_staff = input("Do you want to go back to the staff menu? (Y/N): ")
        
        
def append_consults(idconsult,idpatine,idstaff,month,day,hour,min,problem,solution):
        consult=open("Consultation.csv","a")
        with consult:
                field_names=["Id_Consultation","Id_Patients","Id_Staff","Date","Time","Room","Problem","Solution"]
                append=csv.DictWriter(consult,fieldnames=field_names)
                datee=date(datetime.now().year,month,day)
                datee.strftime("%d/%m/%y")
                timee=time(hour,min)
                append.writerow({"Id_Consultation":idconsult,"Id_Patients":idpatine,"Id_Staff":idstaff,"Date":datee,"Time":timee,"Problem":problem,"Solution":solution})       

def reader_consults():
        consultation=open("Consultation.csv","r")
        with consultation:
                        reader= csv.DictReader(consultation) 
                        for row in reader:
                                print(row)
def search_consults(idlist,coid,aukerak):
        i=0
        
        consultation=open("Consultation.csv","r")
        with consultation:
                reader= csv.DictReader(consultation)
                if(aukerak==0):
                    while( i<len(idlist)):
                        consultation.seek(0)
                        for row in reader:
                            out=True
                            if(idlist[i]==row["Id_Patients"] and out):
                                print(row)
                                out=False
                        i=i+1
                                
                elif(aukerak==1):
                    for row in reader:
                        if(row["Id_Consultation"]==coid):
                            print(row)
                            break
                        


def consultation_menu():
    coid=""
    print("=========================")
    print("=     Consultations     =")
    print("=========================")
    print("  0.Exit\n  1.Add \n  2.Visualize\n  3.Search")
    print("=========================")
    select_consult=(int(input("Select 0-3:")))
    begin="Y"
    while(begin=="Y" or begin=="y"):
            if(select_consult==0):
                    break
            elif(select_consult==1):
                    a="Y"
                    while(a=="Y"):
                            idconsult=(input("Which is the Id consult?"))
                            idpatine=(input("Which is the Id Patient?"))
                            idstaff=(input("Which is the Id Staff?"))
                            month=0
                            while not (1<=month<=12):
                                    month=(int(input("which month?")))
                            day=0
                            while not(1<=day<=31):
                                    day=(int(input("Which day?")))
                            hour=0
                            while not (1<=hour<=24):
                                    hour=(int(input("At what hour?")))
                            min=0
                            while not (1<=min<60):
                                    min=(int(input("At what minute?")))
                            problem=(input("what was the problem?"))
                            solution=(input("Given solution?"))
                            a=(input("Do you want to continue?(Y/N)"))
                            a.capitalize
                    append_consults(idconsult,idpatine,idstaff,month,day,hour,min,problem,solution)
                    begin=(input("Do you want to continue:"))
                    
            elif(select_consult==2):
                    reader_consults()
                    begin=(input("Do you want to continue:"))
                    
            elif(select_consult==3):
                    idlist=[]
                    auker_consult=(int(input("Do you want to search multipatientids(0) or only one ID(1)")))
                    if(auker_consult==0):
                        maxim=(int(input("How many id you want to find?")))
                        while(maxim>0):
                            id_ak=(input("Enter the id: "))
                            maxim=maxim-1
                            idlist.append(id_ak)
                    
                    elif(auker_consult==1):
                        coid=(input("Enter the ID of the consult yo want to search: "))
                
                    else:
                        print("wrong number")
                    
                    search_consults(idlist,coid,auker_consult)
                    begin=(input("Do you want to continue:"))
                    
                    
            
            
        

select_main=0
follow="y"

while(follow=="y" or follow=="Y"):
    print("*************************\n******   GOIZBURU   *****\n*************************\n0.Exit\n1.Patient\n2.Staff\n3.Meetings")
    print("************************")
    select_main=(int(input("Select 0-3: ")))
    print("\n\n")
    if(select_main==0):
        print("\n\nTHANK YOU FOR USING OUR MENU!\n\n")
        break
    elif(select_main==1):
        patient_menu()
        follow=(input("Do you want to continue in the main menu?(Y/N):"))
        

    elif(select_main==2):
        staff_menu()
        follow=(input("Do you want to continue in the main menu?(Y/N):"))
        
    elif(select_main==3):
        consultation_menu()
        follow=(input("Do you want to continue in the main menu?(Y/N):"))
        
    else:
        print("XXX\nXXXWrong numberXXXX")