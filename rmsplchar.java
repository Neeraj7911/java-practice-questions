public class rmsplchar {
    
        String removeSpecialCharacter(String s) {
            StringBuilder result = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) { 
                    result.append(c);
                }
            }
            return result.length() > 0 ? result.toString() : "-1";
        }
    }

