public class transform{
    public static String transformString(String str){
        StringBuilder transformed = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='a'){
                transformed.append('b');
            }
            else if(ch=='b'){
                transformed.append('a');
            }
            else{
                transformed.append(ch);
            }
        }
        return transformed.toString();
    }
    public static void main(String[] args){
        String str = "aaaabbbbbbcccabbbb";
        String tt=transformString(str);
        System.out.print(tt);
    }
}