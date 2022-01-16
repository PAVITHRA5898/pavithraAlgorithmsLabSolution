package pavithra.AlgorithmsLabSolution;

import java.util.*;

public class Target {
    public void targetarray() {
        int size,targetCount;
        int[] targetArray = new int[20]; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        size = sc.nextInt();
        System.out.println("Enter the values of array");
        for(int i=0;i<size;i++){
            targetArray[i] = sc.nextInt();
        }
        System.out.println("Enter the total no of targets that needs to be achieved");
        targetCount = sc.nextInt();
        
        while(targetCount > 0) {
			int flag = 0;
			int target;
			System.out.println("Please enter your target: ");
			target = sc.nextInt();
			long sumOfTransactions = 0;
			for(int i=0; i<size; i++) {
				sumOfTransactions += targetArray[i];
				if(sumOfTransactions >= target) {
					System.out.println("The target is achieved after " + (i+1) + " transactions");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("The given target is not achieved.");
			}
			targetCount--;
		}
        sc.close();
    }
}
