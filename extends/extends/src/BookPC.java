
public class BookPC {

	public static void main(String[] args) {
		useUSB(new Upan());//������չ
		useUSB(new UsbMouse());
	}
	//ʹ�ù���
	public static void useUSB(USB u){//�ӿ����͵����ã����ڽ��գ�ָ�򣩽ӿڵ��������
		u.open();
		u.close();
	}
}
interface USB{//��¶����
	public void  open();
	public void  close();
}
//ʵ�ֹ���
//��Щ�豸�͵��Ե�����Խ�����
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
		// TODO �Զ����ɵķ������
		System.out.println("UsbMouse close");
	}
	
}