public class ReferenceType {
    public static void main(String[] args) {
        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역
        // 변수 데이터의 값 => 힙 메모리 영역의 주소값
        String a = new String("Hello!");
        String b = "Hello!";
        String c = "Hello!";

        if (a==b){
            System.out.println("a is equal b");
        }
        else{
            System.out.println("a is not equal b");
        }

        if (b==c){
            System.out.println("b is equal c");
        }
        else{
            System.out.println("b is not equal c");
        }

        // 변수의 value와 같은 애가 있는지 먼저 확인함
    }
}
