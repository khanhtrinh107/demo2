/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gittest;

/**
 *
 * @author khanh
 */
public class GitTest {

    public static int solve(String s){
        Map<String,String> ms = new HashMap<>();
        ms.put("aa" , "1");
        ms.put("aw", "1");
        ms.put("dd" , "1");
        ms.put("ee" , "1");
        ms.put("oo" , "1");
        ms.put("ow" , "1");
        ms.put("w" , "1");
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            String tmp = String.valueOf(s.charAt(i));
            //w
            if(ms.containsKey(tmp)){
                cnt++;
                i++;
            }
            else if(i < s.length() - 1){
                String tmp2 = tmp + String.valueOf(s.charAt(i+1));
                if(ms.containsKey(tmp2)){
                    cnt++;
                    i += 2;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(solve("hfdawhwhcoomdd"));
    }

}
