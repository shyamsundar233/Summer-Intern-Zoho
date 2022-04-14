public class string {

    public static void main(String[] args){

        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        String str = new String(ch);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.substring(2, 5));
        String strConcat = str + "jkl";
        System.out.println(strConcat);
    }

}
