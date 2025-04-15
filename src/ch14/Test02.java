package ch14;

public class Test02 {
    public static void main(String[] args) {
        Test02 e = new Test02();

        try {
            e.login("white", 1234);
        } catch (Exception ex) {
            System.out.println("[로그인 실패] " + ex.getMessage());
        }

        try {
            e.login("blue", 4321);
        } catch (Exception ex) {
            System.out.println("[로그인 실패] " + ex.getMessage());
        }
    }

    public void login(String id, int pw) throws NotExistIdException, WrongPasswordException {
        if (!id.equals("blue")) {
            throw new NotExistIdException("존재하지 않는 아이디입니다.");
        }
        if (pw != 1234) {
            throw new WrongPasswordException("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("로그인 성공!");
    }

    public class WrongPasswordException extends Exception {
        public WrongPasswordException(String message) {
            super(message);
        }
    }

    public class NotExistIdException extends Exception {
        public NotExistIdException(String message) {
            super(message);
        }
    }
}
