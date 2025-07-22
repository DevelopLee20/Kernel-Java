class Exercise9_7 {
    public static boolean contains(String a, String b) {
//        return a.contains(b);
        return a.indexOf(b) != -1;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}