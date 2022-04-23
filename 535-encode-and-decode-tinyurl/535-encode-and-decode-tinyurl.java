public class Codec {

    Map<String, String> codeDB = new HashMap<>(); // (code, longUrl)
    Map<String, String> urlDB = new HashMap<>(); // (longUrl, code)
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    public String encode(String longUrl) {
        if (urlDB.containsKey(longUrl)) return urlDB.get(longUrl); // url이 이미 등록되어있으면 url 값을 반환
        String code = makeCode(); // 랜덤 코드 생성
        while (codeDB.containsKey(code)) code = makeCode(); // 중복없이 생성
        codeDB.put(code, longUrl); // url, code 저장
        urlDB.put(longUrl, code); // url, code 저장
        return code; // 생성된 랜덤 코드 반환
    }

    public String decode(String shortUrl) {
        return codeDB.get(shortUrl); // 해당 코드의 longUrl 반환
    }
    
    private String makeCode() { // 랜덤 코드 생성
        char[] code = new char[6];
        for (int i = 0; i < 6; i++) 
            code[i] = chars.charAt((int)Math.random() * 62);
        return "http://tinyurl.com/" + String.valueOf(code);
    }
}
