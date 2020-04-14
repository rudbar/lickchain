package lickchain;

import java.util.Date;

public class Block {

	public String hash; // hash - ��� ��������� ���������� ����� ������� ����� � �������
	public String previousHash; // hash ����������� �����, �.�. ��� ���������� ������������ �� ������� ���������� ������
	private String data; // � ����� ������ ��� ����� ������� ���������
	private long timeStamp; // ���������� ����������� � 01/01/1970
	
	// ����������� �����
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
	}
	
}
