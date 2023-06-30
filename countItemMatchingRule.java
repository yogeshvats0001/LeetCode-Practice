/**1773. Count Items Matching a Rule
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 * 
 * Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 * 
 * Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 */

import java.util.ArrayList;
import java.util.List;

public class countItemMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int keyIndex = 0;
        if(ruleKey.equals("type")) keyIndex = 0;
        else if(ruleKey.equals("color")) keyIndex = 1;
        else if(ruleKey.equals("name")) keyIndex = 2;
        int result = 0;
        
        
        for(List<String> element : items){
            if(element.get(keyIndex).equals(ruleValue)){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // hard coded the input
        List<String> inList1 = new ArrayList<>();
        inList1.add("phone");
        inList1.add("blue");
        inList1.add("pixel");

        List<String> inList2 = new ArrayList<>();
        inList2.add("computer");
        inList2.add("silver");
        inList2.add("lenovo");

        List<String> inList3 = new ArrayList<>();
        inList3.add("phone");
        inList3.add("gold");
        inList3.add("iphone");

        List<List<String>> items = new ArrayList<>();
        items.add(inList1);
        items.add(inList2);
        items.add(inList3);

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
}


// NOTE :: One can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
