// Write a program for finding the value of Variable after performing the Operations.
// Initial Value is 0.
// ++X or X++ => +1
// --X or X-- => -1

// Input:
// ["--X","X++","X++"]

// Output:
// 1


public class findValueAfterOperationsArray {
    public static int solution(String[] operations){
        int resultValue = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                resultValue++;
            }else{
                resultValue--;
            }
        }
        return resultValue;
    }

    public static void main(String[] args) {
        //input(hard coded)
        String[] operations = {"--X","X++","X++"};
        System.out.println(solution(operations));
    }
}



//Java Note: We cant use == operator for checking the String typed variable as == is for reference comparison(i.e., to check whether it refers to same memory location or not) and .equals is used for content comparison.
