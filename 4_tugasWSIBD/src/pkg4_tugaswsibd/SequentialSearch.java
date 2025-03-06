package pkg4_tugaswsibd;

public class SequentialSearch {
     public static void main(String[] args) {
        int[] exampleVariableOne = {2, 5, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        sequentialSearch(exampleVariableOne, target);
     }
     
     public static void sequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        
        // mencari setiap index dari array hingga mencapai panjang array
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                // jika ditemukan, index di set sebagai nilai i dan loop dihentikan
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Your target integer does not exist in the array");
        } else {
            System.out.println("Your target integer is in index " + index + " of the array");
        }
    }
}
