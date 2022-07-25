/* 1108. Defanging an IP Address
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
   A defanged IP address replaces every period "." with "[.]".
 *
 * Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

 * Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

 */

public class defangingIPAddress {
    public static String defanging(String address){
        String resultStr = "";
        for(int i=0; i<address.length(); i++){
            char ch = address.charAt(i);
            if(ch != '.'){
                resultStr += ch;
            }else{
                resultStr = resultStr +  '[' + ch + ']';
            }
        }
        return resultStr;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defanging(address));
    }
}


//Note: We can use += operator only with addition of single value. 
// resultStr += ch; ✔
// resultStr += ch + ']'; ❌