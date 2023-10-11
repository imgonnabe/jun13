package jun13;

public class String02 {
	public static void main(String[] args) {
		// 이메일 판별하기
		// @
		String email = "poseidon@kakao.com";
		if (email.indexOf('@') == -1) {
			System.out.println("email형식이 아닙니다.");
		} else {
			System.out.println("올바른 email입니다.");
		}

		if (email.contains("@")) {
			System.out.println("올바른 email입니다.");
		} else {
			System.out.println("email형식이 아닙니다.");
		}

		String id = email.substring(0, email.indexOf('@'));
		String server = email.substring(email.indexOf('@') + 1);
		System.out.println("아이디: " + id);
		System.out.println("서버: " + server);
		if (server.endsWith(".com") || server.endsWith(".net")) {
			System.out.println("올바른 서버입니다.");
		}
		
		// endsWith()
		System.out.println(email.endsWith(".com"));// true
		System.out.println(email.endsWith(".net"));// false
		
		// join("연결자", 값1, 값2, 값3 ...)
		String msg = String.join("-" , id, "님 반갑습니다.");
		System.out.println(msg);// poseidon-님 반갑습니다.
	}

}
