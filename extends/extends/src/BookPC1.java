
public class BookPC1 {

	public static void main(String[] args) {
		useUSB(new Sound());
	}
	public static void useUSB(USB1 u){
		u.open();
		u.close();
	}
}
interface USB1{
	public void open();
	public void close();
}
class Sound implements USB1{
	public void open(){
		System.out.println("音响已连接到电脑");
	}
	public void close(){
		System.out.println("音响已经弹出");
	}
}
