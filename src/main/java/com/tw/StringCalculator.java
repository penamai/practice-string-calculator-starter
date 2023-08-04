package com.tw;

public class StringCalculator {
    public int add(String string) {
        int sum = 0;
        String cur_num = "";
        for(int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                cur_num += String.valueOf(string.charAt(i));
            }else if(cur_num != ""){
                sum += Integer.parseInt(cur_num);
                cur_num = "";
            }
        }
        if(cur_num != "")
            sum += Integer.parseInt(cur_num);

        return sum;
    }
}
