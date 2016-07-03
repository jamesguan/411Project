package processor.cache;

public class Cache {
	private int accessTime;
	private int blocks;
	private int blockSize;
	private int cache [][];
	
	public Cache(int accessTime, int blocks, int blockSize){
		this.accessTime = accessTime;
		this.blocks = blocks;
		this.blockSize = blockSize;
		this.cache = new int[blocks][blockSize];
	}
}
