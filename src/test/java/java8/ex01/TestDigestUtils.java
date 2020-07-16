package java8.ex01;

import org.apache.commons.codec.digest.DigestUtils;

public class TestDigestUtils {

	public static void main(String[] args) {
		String password = "coucou1&";
		String encodedPassword = DigestUtils.sha1Hex(password);
		System.out.println(encodedPassword);
		
		password = "2&";
		System.out.println(DigestUtils.sha1Hex(password));
		
		// L'utilisateur saisit un mot de passe
		// TU encode son mot de passe et tu vérifies que son mot de passe
		// est égal au mode de passe encodé stocké en base de données.
		

	}

}
