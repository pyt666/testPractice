/**
 * 
 */
package Prototype;

import java.util.Hashtable;

/**
 * @author pyt
 *
 */
public class ShapeCache {
	/*
	 * 将Shape对象存储在一个hashtable中，并在请求时放回其克隆
	 */
	private static Hashtable<String, Shape> shapeMap 
    = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
	      Shape cachedShape = shapeMap.get(shapeId);
	      return (Shape) cachedShape.clone();
	   }
	
	// 对每种形状都运行数据库查询，并创建该形状
	   // shapeMap.put(shapeKey, shape);
	   // 例如，我们要添加三种形状
	   public static void loadCache() {
	      Circle circle = new Circle();
	      circle.setId("1");
	      shapeMap.put(circle.getId(),circle);
	 
	      Square square = new Square();
	      square.setId("2");
	      shapeMap.put(square.getId(),square);
	 
	      Rectangle rectangle = new Rectangle();
	      rectangle.setId("3");
	      shapeMap.put(rectangle.getId(),rectangle);
	   }

}
