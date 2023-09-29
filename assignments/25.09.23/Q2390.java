class Q2390 {
    public String removeStars(String s) {
        Stack<Character> a = new Stack<>();
        Stack<Character> x = new Stack<>();

        for(char b : s.toCharArray()){

            if(b == '*'){
                a.pop();
            }
            
            else a.push(b);
        }
        
        while(!a.isEmpty()){
            x.push(a.pop());
        }

        StringBuilder st = new StringBuilder();

        while(!x.isEmpty()){
            st.append(x.pop());
        }

        return st.toString();
    }
}