package person;

public class PersonController {
    private Person model;
    private PersonView view;
    
    public PersonController(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setPersonName(String name) {
        model.setName(name);
    }
    
    public void setPersonAge(int age) {
        model.setAge(age);
    }
    
    public void updateView() {
        view.printPersonDetails(model.getName(), model.getAge());
    }
}
