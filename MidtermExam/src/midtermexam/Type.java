package midtermexam;
public class Type {
    private String userName;
    private int age;

    public Type(String userName, int age){
        this.userName = userName;
        this.age = age;
    }
    public String getuserName(){
        return this.userName;
    }
    public void setuserName(String userName){
        this.userName = userName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}