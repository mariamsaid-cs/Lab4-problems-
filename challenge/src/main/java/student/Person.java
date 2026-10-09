package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(){
        this.id = nextId++;
        this.firstName = "";
        this.secondName = "";
        this.phone = "";
        this.email = "";
    }

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }

    //Getters and setters
    public int getId(){return this.id;}
    public String getFirstName(){return this.firstName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public String getSecondNameName(){return this.secondName;}
    public void setSecondName(String secondName){this.secondName = secondName;}
    public String getPhone(){return this.phone;}
    public void setPhone(String phone){this.phone = phone;}
    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}

    @Override
    public String toString(){
        return "Person[id = " + id + ", lastName = " + secondName + ", firstName = " + firstName + ", phone = "
                + phone + ", email = " + email + " ]";

    }

}

