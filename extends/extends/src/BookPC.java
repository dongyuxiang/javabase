
public class BookPC {

	public static void main(String[] args) {
		useUSB(new Upan());//功能拓展
		useUSB(new UsbMouse());
	}
	//使用规则
	public static void useUSB(USB u){//接口类型的引用，用于接收（指向）接口的子类对象。
		u.open();
		u.close();
	}
}
interface USB{//暴露规则
	public void  open();
	public void  close();
}
//实现规则
//这些设备和电脑的耦合性降低了
class  Upan implements USB{
	public void open(){
		System.out.println("Upan  open");
	}
	public void close(){
		System.out.println("Upan close");
	}
}
class UsbMouse implements USB{
	public void open() {
		System.out.println("UsbMouse open");
	}
	public void close() {
		// TODO 自动生成的方法存根
		System.out.println("UsbMouse close");
	}
	
}