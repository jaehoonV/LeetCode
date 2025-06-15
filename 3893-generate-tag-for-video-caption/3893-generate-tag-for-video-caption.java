class Solution {
    public String generateTag(String caption) {
        String[] arr = caption.split(" ");
        StringBuilder output = new StringBuilder();
        output.append("#");
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            String cleaned = arr[i].replaceAll("[^A-Za-z]", "");
            if (cleaned.isEmpty()) continue;
            
            if(a == 0){
                output.append(cleaned.toLowerCase());
            }else{
                String firstLetter = cleaned.substring(0, 1).toUpperCase();
                String remainLetter = cleaned.substring(1).toLowerCase();
                output.append(firstLetter + remainLetter);
            }
            a++;
        }
        String out = output.toString();
        
        return out.length() > 100 ? out.substring(0, 100) : out;
    }
}