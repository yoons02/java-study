public class PrimitiveType {
    public static void main(String[] args) {
        // 정수형 (처리할 수 있는 용량에 맞게 쓸 것)
        // 1. byte(1 byte)
        // 2. short(2 byte)
        // 3. int(4 byte)
        // 4. long(8 byte)
        byte a = 7;

        // 실수형
        // 1. double(8 byte)
        // 2. float(4 byte)

        double c = 12.43; // 예를 자주 씀!
        float d = 13.54f; // float은 뒤에 f를 붙어야 인식함

        // 문자형 - 유니코드 활용
        // char(2 byte)
        char char_1 = 'a';

        // 논리형
        // boolean(1 byte)
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = (100 < 0); // false

    }
}
