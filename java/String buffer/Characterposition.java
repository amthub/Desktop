public class Characterposition {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Geeky");
        sb.append("shows");
        sb.insert(10, "channel");
        sb.replace(10,11, "youtube");
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
}
