package midtermexam;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MidtermExam{
    public static void main(String[] args){
        ArrayList<Type> getData = new ArrayList<Type>();
        backMenu(getData);
    }
    public static void backMenu(ArrayList<Type> getData){
       
        String menu = JOptionPane.showInputDialog("=======Options=======" + "\n" + "Enter A to (A)dd entry" + "\n" + "Enter D to (D)elete entry" + "\n" + "Enter V to (V)iew all entries" + "\n" + "Enter U to (U)pdate an entry" + "\n" + "Enter E to (E)xit" + "\n" + "Select your Choice: ");
        char choice = menu.toUpperCase().charAt(0);

        switch(choice){
            case 'A':
                addData(getData);
                break;
            case 'D':
                deleteData(getData);
                break;
            case 'V':
                viewData(getData);
                break;
            case 'U':
                updateData(getData);
            case 'E':
                System.exit(0);
        }
    }
        public static void addData(ArrayList<Type> getData){
            String add = JOptionPane.showInputDialog("How many data would you like to add?");
            int numOfInputs = Integer.parseInt(add);
             for(int i = 0; i < numOfInputs; i++){
            Type newType = new Type(null, 2);
            newType.setuserName(JOptionPane.showInputDialog("Enter username:"));
            newType.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter age:")));
            getData.add(newType);
        }
             backMenu(getData);
    }
        public static void deleteData(ArrayList<Type> getData){
            int matches = 1;
            String outcome = "";
                 for(Type data : getData){
                     String name = data.getuserName().toString();
                     int age = data.getAge();
                     outcome += "\n" + matches + ". " + name + " is " + age;
                     matches++;
            }
            String remove = JOptionPane.showInputDialog("Data Record" + outcome + "\n\n" + "Enter number to delete:");
            int numToRemove = Integer.parseInt(remove) - 1;
            getData.remove(numToRemove);
            JOptionPane.showMessageDialog(null, "There is/are " + getData.size() + " left found in the list");
            backMenu(getData);
        }
        public static void viewData(ArrayList<Type> getData){
            int matches = 1;
            String outcome = "";
            for(Type data : getData){
                     String name = data.getuserName().toString();
                     int age = data.getAge();
                     outcome += "\n" + matches + ". " + name + " is " + age;
                     matches++;
            }
            JOptionPane.showMessageDialog(null, "Data Record" + outcome);
            backMenu(getData);
}
        public static void updateData(ArrayList<Type> getData){
            int matches = 1;
            String outcome = "";
            for(Type data : getData){
                     String name = data.getuserName().toString();
                     int age = data.getAge();
                     outcome += "\n" + matches + ". " + name + " is " + age;
                     matches++;
            }
            String update = JOptionPane.showInputDialog("Data Record" + outcome + "\n\n" + "Who do you want to update? (Choose a number:)");
            int dataUpdate= Integer.parseInt(update) - 1;
            getData.get (dataUpdate).setuserName(JOptionPane.showInputDialog("Enter new username:"));
            getData.get(dataUpdate).setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter new age: ")));
            backMenu(getData);
            }           
}    

