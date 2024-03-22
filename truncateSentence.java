/*1816. Truncate Sentence
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
 * 
 * Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".

 * 
 * Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".

 * 
 */

import java.util.Scanner;

public class truncateSentence {

    static Scanner scan = new Scanner(System.in);

    static String truncateString(String s, int k){
        String[] arr = s.split(" ");
        if(arr.length < k){
            return "Check your entered K";
        }

        String[] resultArr = new String[k];
        for(int i = 0; i < k; i++){
            resultArr[i] = arr[i];
        }

        String resultStr = String.join(" ", resultArr);
        return resultStr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("Enter the count of words: ");
        int k = scan.nextInt();

        String resultStr = truncateString(str, k);
        System.out.println(resultStr);
    }
}

//
