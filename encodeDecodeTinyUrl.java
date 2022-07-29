/* 535. Encode and Decode TinyURL
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.
There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
Implement the Solution class:
Solution() Initializes the object of the system.
String encode(String longUrl) Returns a tiny URL for the given longUrl.
String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.
 * 
 * Input: url = "https://leetcode.com/problems/design-tinyurl"
Output: "https://leetcode.com/problems/design-tinyurl"

Explanation:
Solution obj = new Solution();
string tiny = obj.encode(url); // returns the encoded tiny url.
string ans = obj.decode(tiny); // returns the original url after deconding it.
 * 
 * 
 */

public class encodeDecodeTinyUrl {
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        return shortUrl;
    }

    public static void main(String[] args) {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = encode(longUrl);
        System.out.println(shortUrl);
        longUrl = decode(shortUrl);
        System.out.println(longUrl);

    }
}

//Note: Since we dont have to worry about how algorithm will work and just want encoding and decoding works properly for any particular URL.
