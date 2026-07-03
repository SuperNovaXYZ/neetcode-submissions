class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack= new Stack<>();
        
        

        for (int i=0; i<tokens.length;i++){
            
            if(Character.isDigit(tokens[i].charAt(0)) || tokens[i].length() > 1 && tokens[i].charAt(0) =='-' && Character.isDigit(tokens[i].charAt(1))){
                stack.push(tokens[i]);
            } else {
                String b= stack.pop();
                String a= stack.pop();
                int numa = Integer.parseInt(a);
                int numb = Integer.parseInt(b);
                String operator= tokens[i];
                stack.push(String.valueOf( switch(operator){
                    case "+" -> numa + numb;
                    case "-" -> numa - numb;
                    case "/" -> numa / numb;
                    case "*" -> numa * numb;
                    default -> throw new IllegalArgumentException("Unknown operator");
                    }));
                    
                
            }


        }

        return Integer.parseInt(stack.pop());
    }
}
