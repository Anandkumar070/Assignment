package phase1.mp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class fixbug{

    public static void main(String[] args) {
    	
        System.out.println("HELLO");
        System.out.println("\n**************\n");
        System.out.println("\tWelcome\n");
        System.out.println("**************");
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(2000);
        expenses.add(5500);
        expenses.add(35000);
        expenses.add(22000);
        expenses.add(1090);
        optionsSelection(expenses);

    }
    private static void optionsSelection(ArrayList<Integer> expenses) {
        String[] A = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] a1 = {1,2,3,4,5,6};
        int  slen = a1.length;
        for(int i=0; i<slen;i++){
            System.out.println(A[i]);
            // display the all the Strings mentioned
        }
 
        System.out.println("\nEnter the choice:\t");
        Scanner s = new Scanner(System.in);
        int  options =  s.nextInt();
                
        	switch (options){
                    case 1:
                        System.out.println("Your expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection(expenses);
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = s.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        System.out.println(expenses+"\n");
                        optionsSelection(expenses);
                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int will = s.nextInt();
                        if(will==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection(expenses);
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection(expenses);
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection(expenses);
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        

    
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
    	Scanner in=new Scanner(System.in);
        int l = arrayList.size();
        System.out.println("Enter the expense you need to search:\t");
        //Complete the method
        int key=in.nextInt();
        int x=0;
        int y=0;
        for(int i=0; i<l; i++) {
            
            if(arrayList.get(i)==key) {
              x=1;
              y=i;
            }
        }
        if(x==1) {
        	System.out.println(key+ " is found at index " +y);
        }

   }
        

    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The expenses should be sorted in ascending order.

        for (int i = 0; i < arrlength ; i++) {

            for (int j = arrlength - 1; j > i; j--) {
                if (arrayList.get(i) > arrayList.get(j)) {

                    int temp = arrayList.get(i);
                    arrayList.set(i,arrayList.get(j)) ;
                    arrayList.set(j,temp);

                }

            }

        }
        for (int i: arrayList) {
            System.out.print(i+ "   ");
        }
        System.out.println();
        
        
    }
}