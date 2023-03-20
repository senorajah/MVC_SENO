package person;
public class Main {
    public static void main(String[] args) {
        // Create a new person
        Person person = new Person("John", 30);
        
        // Create a view for that person
        PersonView personView = new PersonView();
        
        // Create a controller to handle user input and update the view
        PersonController personController = new PersonController(person, personView);
        
        // Update the person's name and age
        personController.setPersonName("Jane");
        personController.setPersonAge(25);
        
        // Update the view with the new person details
        personController.updateView();
    }
}
