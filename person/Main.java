package person;
public class Main {
    public static void main(String[] args) {
        
        Person person = new Person("John", 30);
       
        PersonView personView = new PersonView();
        
       
        PersonController personController = new PersonController(person, personView);
        
        personController.setPersonName("Jane");
        personController.setPersonAge(25);
       
        personController.updateView();
    }
}
