class Solution {
    List<String> ans = new ArrayList<>();

    // open and close represents remaining choices of open and close brackets
    public void generate(int open, int close, String op){
        // B.C
        if(open == 0){
            while(close != 0){
                op += ")";
                close--;
            }
            ans.add(op);
            return;
        }

        if(open == close){
            generate(open-1,close,op + "(");
        }else{
            generate(open-1,close,op + "(");
            generate(open,close-1,op + ")");
        }
    }
    public List<String> generateParenthesis(int n) {
        String op = "";
        generate(n,n,op);
        return ans;
    }
}