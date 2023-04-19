public class test {

    // n개 중에서 r개를 뽑는 조합(combination)을 구하는 메소드
    public static int combination(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    public static void main(String[] args) {
        int n = 10; // 전체 인원 수
        int r = 4; // 뽑을 인원 수
        int result = combination(n, r);
        System.out.println(n + "명 중에서 " + r + "명을 뽑는 경우의 수: " + result);
    }

}
