/* 1678. Goal Parser Interpretation
 * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
   Given the string command, return the Goal Parser's interpretation of command.
 * 
 * Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

 *Input: command = "G()()()()(al)"
Output: "Gooooal"

 *Constraints:
1 <= command.length <= 100
command consists of "G", "()", and/or "(al)" in some order.
 */

 public class goalParserInterpretation{
    public static String interpret(String command){
        String resultStr = "";
        int i = 0;
        while(i < command.length()){
            char ch = command.charAt(i);
            if(ch == 'G'){
                resultStr += 'G';
                i += 1;
            }else if(ch == '(' && command.charAt(i+1) == ')'){
                resultStr += 'o';
                i += 2;
            }else{
                resultStr += "al";
                i += 4;
            }
        }
        return resultStr;
    } 

    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
 }