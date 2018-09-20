package enumTest;

/**
 * @author pyt
 * 2018-09-20
 * 向枚举中添加新方法
 */
public enum Color implements Behavior{
	RED("红色",1),
	GREEN("绿色",2),
	YELLOW("黄色",3);
	//成员变量
	private String name;
	private int index;
	//构造方法(必须有含参构造器)
	private Color(String name, int index) {
		this.name = name;
		this.index = index;
	}
	//普通方法
	public static String getName(int index) {
		for(Color c : Color.values()) {
			if(c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	//方法重写
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.index+"_"+this.name;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		 System.out.println(this.index+"_"+this.name);
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.name;
	} 
	
	

}
