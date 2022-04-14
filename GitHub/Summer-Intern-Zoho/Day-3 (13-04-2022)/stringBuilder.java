public class stringBuilder {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append('W'));
        System.out.println(sb.insert(4, 'N'));
        System.out.println(sb.append(58));

        String str = sb.toString();
        String newString=(new StringBuffer(str)).append(10).append(20).append(90).toString();
        System.out.println(newString);

    }

}