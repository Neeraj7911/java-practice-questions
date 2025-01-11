public class removeSTRspace {

        String modify(String s) {
            // your code here
            char [] ssArr = s.toCharArray();
            StringBuilder result = new StringBuilder();
    
            for(int i=0; i<ssArr.length; i++){
                if(ssArr[i]==' ') continue;
                result.append(ssArr[i]);
            }
            return result.toString();
        }
    }//
