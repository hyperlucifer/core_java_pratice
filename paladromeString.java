package day36;

public class paladromeString {
    static boolean ispal(String str,int l,int r){
        if (l>=r) {
            return true;
        }
        if (str.charAt(l)!=str.charAt(r)) {
            return false;
        }
        else
        return ispal(str, l+1, r-1);
    }
    //print the powerset of a given String

    static void powerset(String s,int i,String cur){
        if (i==s.length()) {
            System.out.println(cur+" ");
            return;
        }
        powerset(s, i+1, cur+s.charAt(i));
        powerset(s, i+1, cur);
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(ispal(str, 0, 6));
        powerset(str, 0, " ");
    }
}
