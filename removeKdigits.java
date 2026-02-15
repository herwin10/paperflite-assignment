public String removeKdigits(String num, int k) 
    {
        StringBuilder sb=new StringBuilder();
        for(char digit:num.toCharArray()){
            while(k>0 && sb.length()>0 && sb.charAt(sb.length()-1)>digit){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(digit);
        }
        while(k>0 && sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
                k--;
        }
        int i=0;
        while(i<sb.length() && sb.charAt(i) == '0'){
            i++;
        }
        String res = sb.substring(i);
        return res.length() == 0 ? "0" :res;
        
    }
