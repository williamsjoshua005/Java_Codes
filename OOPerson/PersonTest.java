public class PersonTest{

 public static void main(String[] args){
 
   
  Person person = new Person();
  Girl girl = new Girl(); 
  Boy boy = new Boy();
  System.out.println("This is the person name " + person.name("Abdul"));
  System.out.println("The skin colour of dis person is " + person.colour("black"));
  System.out.println("Mode of talking "+ person.talk("speak"));
  System.out.println("mode of movement "+ person.move("walk"));
  System.out.println("The sex of the person is "+ girl.sex("female"));
  System.out.println("The sex of the person is "+ boy.sex("male"));
  System.out.println("the boys "+ boy.name("Akinsola"));
 System.out.println("The boy names are" +boy.name("Akinsola","Akinwale"));
 }
 
}
