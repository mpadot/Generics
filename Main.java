import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        System.out.println("How many people do you want to put in the list?:  ");
        int names = kb.nextInt();
            for(int i = 0; i< names; i++){
                System.out.println("Enter a name: ");
               String person = kb.next();
               people.add(person);

                System.out.println("Enter the age of "+ person + " ");
                int ages = kb.nextInt();
                age.add(ages);
            }
            System.out.println("___________________________________________________");
           printList(people);
        printList(age);
    }


    public  static <E> void printList(List<E> list){

            for (int i = 0; i< list.size(); i++){

                System.out.println(list.get(i));
            }


    }
}