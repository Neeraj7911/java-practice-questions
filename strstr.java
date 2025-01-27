class strstr {
    public int strStr1(String haystack, String needle) {
        // If needle is empty, return 0 as per the problem statement
        if (needle.isEmpty()) {
            return 0;
        }
        
        // Use the indexOf method to find the first occurrence of needle in haystack
        return haystack.indexOf(needle);
    }
}