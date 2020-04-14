package lickchain;

import java.util.Date;

public class Block {

	public String hash; // hash - это цифоровой уникальный номер каждого блока в цепочке
	public String previousHash; // hash предидущего блока, т.к. все вычисления производятся на основне предидущих блоков
	private String data; // в нашем случае это будет простое сообщение
	private long timeStamp; // количество миллисекунд с 01/01/1970
	
	// Конструктор Блока
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
	}
	
}
