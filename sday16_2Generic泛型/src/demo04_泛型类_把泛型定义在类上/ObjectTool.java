package demo04_泛型类_把泛型定义在类上;

/*
 * 泛型类:把泛型定义在类上。
 * 
 * 格式：再类后面加：<名称>
 * 名称:符合类型标识符就行。T,abc...
 * 
 * 格式：public class 类名<泛型类型1, ...>
 * 注意：泛型类型必须是引用类型
 */
public class ObjectTool<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
