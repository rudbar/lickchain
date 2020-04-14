package lickchain;

import java.security.MessageDigest;

/* ��� ���������� ������������� ���������� ����������� ������ ������������� �����������������
 ���������� SHA256, �� ����� ������������ ����� ������ �� �����
*/

public class StringUtil {

	// ��������� Sha256 � ������ � ������ ��� ������� ��������� ����� ���������������� ����������� ������
	public static String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			// ���������� sha256 � ������
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer(); // � hexString ����� ����������� �������� ����� � hex ���������
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
