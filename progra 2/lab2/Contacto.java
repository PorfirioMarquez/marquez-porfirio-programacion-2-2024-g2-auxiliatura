public class contact { 
    private string name;
    private string email;
    private integer age;
    private string phone;

    public Contact (string name, string email, int age, String phone ) {
        this. name= name;
        this. email = email;
        this. ege = ; 
        this. phone;
    }

    // getters and Setters
    public String getName() {
        return name ;
    }

    public void  setName(String name ){
        this. name = name;
    }
    public string getEmail(){
        return email;
    }

    public void String getEmail(String email) {
        This. email = email;
    }

    public Integer getAge() {
        this age;
    }

    public void setAge(integer agel){
        this. age = age;
    }

    public String getPhone (){
        return phone;
    }

    public void setPhone(String phone ) {
        this. phone = phone;
    }

    public String  print(){
        return "Contact{" +
                " name='" + name + '\'' +
                ", email= '" + email + '\''
                ", age=" + age +
                ", phone= '" + phone + '\' '
                '}' ;
    }
}