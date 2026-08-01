class student {
   String name = "jyoti";
    int age =20;
    
       void study (){
           System.out.println(name + " is learning new concepts.");
        }
    } 
    public class object_orientend_ex {
    public static void main(String[] args) { 

            student s1= new student();
            System.out.println(s1.name);
            System.out.println(s1.age);
            s1.study();

        }
    }



        
        
