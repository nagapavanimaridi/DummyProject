package org.example;

public class IntegerToRoman {
    public static String integerToRoman(int num){
        int []n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []s= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String str = "";
        int max = Integer.MAX_VALUE;
        boolean isNegative = false;
        System.out.println(n.length + "s len="+ s.length);

        if(num< 0){
            isNegative = true;
            num = num * -1;
        }

        while (num >0){
            for(int i=0;i<n.length;i++){
                if(num>=n[i]){
                    num = num - n[i];
                    str = str + s[i];
                }
            }
        }

        if(isNegative)
            return "-"+str;

        return str;
    }

    public static void main(String[] args) {

        System.out.println(integerToRoman(-1994));

    }
}
