public class Codec {
    char[] urlChars = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789").toCharArray();
    HashMap<String, String> urlToShort = new HashMap<>();
    HashMap<String, String> shortToUrl = new HashMap<>();
    String BASE = "http://tinyurl.com/";
    int MOD = 62;
    int counter = 1;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(urlToShort.containsKey(longUrl)){
            return BASE + urlToShort.get(longUrl);
        }
        String add = encode();
        urlToShort.put(longUrl, add);
        shortToUrl.put(add, longUrl);
        return BASE + add;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToUrl.get(shortUrl.substring(shortUrl.lastIndexOf('/')+1));
    }

    private String encode(){
        int x = counter++;
        StringBuilder sb = new StringBuilder();
        while(x>0){
            sb.append(x%MOD);
            x /= MOD;
        }
        return sb.reverse().toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));