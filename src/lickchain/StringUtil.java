package lickchain;

import java.security.MessageDigest;

/* Для рандомного генерирования цифорового уникального номера воспользуемся криптографическим
 алгоритмом SHA256, но можно использовать любой другой по вкусу
*/

public class StringUtil {

	// Применяем Sha256 к строке и выдаем уже готовый результат ввиде сгенерированного уникального номера
	public static String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			// Применияем sha256 к инпуту
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer(); // в hexString будет содержаться цифровой номер в hex кодировке
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1)
					hexString.append('0');
				else
					hexString.append(hex);
			}
			return hexString.toString();
			
		}
		
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
