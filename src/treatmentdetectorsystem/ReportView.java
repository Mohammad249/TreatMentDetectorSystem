/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treatmentdetectorsystem;

/**
 *
 * @author Al Azad
 */
public class ReportView {
    
    
       private String  disease;
      private String   age;
      private String   medicinname;;
      private String   medicintype;
      private String   eatinrols;
      private String   medicinduration;
      private String   company;
     
      
      
       public ReportView(String Diseases ,String Age, String Medicin_Name, String MedicinType,String EatingRols, String MedicinDuration, String Comphany)
           {  
                 
          
                  this.disease = Diseases;
                   this.age = Age;
                   this.medicinname = Medicin_Name;
                    this.medicintype = MedicinType;
                     this.eatinrols = EatingRols;
                      this.medicinduration = MedicinDuration;
                       this.company = Comphany;
                      
                   
                
             
               
           }
              
               public String getdisease()
           {
               return disease;
           }
         
           public String getage()
           {
               return age;
           }
           public String getmedicinname()
           {
               return medicinname;
           }
         
           public String getmedicintype()
           {
               return medicintype;
                       
           }
           public String geteatinrols()
           {
               return eatinrols;
           }
           public String getmedicinduration()
           {
               return medicinduration;
           }
           public String getcompany()
           {
               return company;
           }
         

}

