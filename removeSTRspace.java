public class removeSTRspace {

        String modify(String s) {
            // your code here
            char [] sArr = s.toCharArray();
            StringBuilder result = new StringBuilder();
    
            for(int i=0; i<sArr.length; i++){
                if(sArr[i]==' ') continue;
                result.append(sArr[i]);
            }
            return result.toString();
        }
    }
