import java.util.Arrays;

class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        }

        if (length <= 0) {
            return "";
        }

        if (src.length() > length) {
            return src.substring(0, length);
        }

        char[] c = new char[length];
        Arrays.fill(c, '0');

        int i = c.length - src.length();
        for (char ch : src.toCharArray()) {
            c[i++] = ch;
        }

        return String.valueOf(c);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}