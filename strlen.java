class strlen {
    public static void main(String[] args) {
        
        // System.out.println("Try programiz.pro");
        String s="qwqrjygvegd";
        int len=0;
        char[] ch=s.toCharArray();
        for(char c:ch){
            len++;
        }
        
        System.out.println(len);
    }
}