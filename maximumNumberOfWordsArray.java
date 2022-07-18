/*2114. Maximum Number of Words Found in Sentences
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
*/

public class maximumNumberOfWordsArray {
    public static int numberOfWords(String[] sentences){
        int result = Integer.MIN_VALUE;
        for(String element : sentences){
            int count = 1; //as " " would be one less than words.
            for(int i=0; i<element.length(); i++){
                char ch = element.charAt(i);
                if(ch == ' '){
                    count++;
                }
            }

            //check the max value of the result
            if(count > result){
                result = count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int maxValue = numberOfWords(sentences);
        System.out.println(maxValue);
    }
}
