public class TypeCasting {
    public static void main(String[] args) {
        int a = 65;
        char b = (char)a;
        System.out.println(b);

        double c = 12.4;
        // int d = c; => ERROR : 여유공간이 없어.. => 형변환 필요!

        int e = 3;
        double f = e; // 공간이 남아서 오케이!

    }
}