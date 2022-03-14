public class SwapCases {

    public static void main(String args[]) {
        System.out.println("testing *****");
        String str="This IS test";
        String strSwap="";
        char ch1, ch2;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ch1 = Character.toLowerCase(c);
            } else {
                ch1 = Character.toUpperCase(c);
            }
            strSwap+=ch1;
        }
        System.out.println(strSwap);
    }
}