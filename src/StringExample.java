public class StringExample {
    public static void main(String[] args) {
        // String => 문자열 객체
        // 객체 -> 힙 메모리 영역
        // 변수 -> 힙 메모리 영역의 주소

        String str_1 = "안녕!";
        String str_2 = new String("안녕!");
        String str_3 = "안녕!";

        // str_1과 str_3은 변수값(주소값) 같음
        // str_2는 독립적인 메모리

        // check
        if (str_1.equals(str_2)){
            System.out.println(str_1.equals(str_2));
        }
        else {
            System.out.println("false");
        }

        if (str_1.equals(str_3)){
            System.out.println(str_1.equals(str_3));
        }
        else {
            System.out.println("false");
        }
        // 왜 다 true지?? => equals 메소드는 주소가 아닌 내용을 비교함

        // 문자열 병합
        // 1. + 연산자 활용
        String s_1 = "Hello";
        String s_2 = " World";
        System.out.println(s_1+s_2);

        // 2.String Builder
        StringBuilder strBdr = new StringBuilder("Hello "); // 공간할당
        strBdr.append("World!"); // append
        String str = strBdr.toString(); // 변환
        System.out.println(str);

        // 문자열 슬라이스
        String text_1 = "이름 : 김윤성";
        System.out.println(text_1.indexOf(':'));
        System.out.println(text_1.substring(5, 8)); // 이름만 출력 substring(begin, last+1)

        // .equalsIngnoreCase => 대소문자 상관없이 값 비

        // 공백제거
        // 1. 양쪽
        String q = " java ";
        q = q.trim();
        System.out.println(q);

        // 2. 중간 공백
        String p = " ja   va  ";
        p = p.replace(" ", "");
        System.out.println(p);
    }
}
