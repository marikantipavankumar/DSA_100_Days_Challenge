package tcs_nqt_coding_qns.general;

import java.util.*;

public class ExpenseCalculator {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Income:");
        double income = sc.nextDouble();
        double totalExpense = 0;
        double totalSavings=income;
        Map<String,Double> expenseDetails = new LinkedHashMap<>();

        
        while(true){
            System.out.println("Enter Expense Type:");
            String  expenseType = sc.next();
            if(expenseType.equals("done")){
                break;
            }
            Double expenseAmount = sc.nextDouble();
            if(expenseAmount>totalSavings){
                break;
            }
            income =income-expenseAmount;
            totalSavings = income;

            if(expenseDetails.containsKey(expenseType)){
                expenseDetails.put(expenseType,expenseDetails.getOrDefault(expenseType,expenseAmount)+expenseAmount);
            }
            else{
                expenseDetails.put(expenseType,expenseAmount);
            }
            totalExpense +=expenseAmount;
        }

        System.out.println("Total Income: "+income);
        System.out.println("Total Expenses are:"+totalExpense);
        System.out.println("Total Savings are:"+totalSavings);

        for(String expense: expenseDetails.keySet()){
            System.out.println(expense+" "+expenseDetails.get(expense));
        }





    }
}
