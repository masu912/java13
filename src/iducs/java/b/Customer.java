
package iducs.java.b;

public abstract class Customer extends Human {
	
	abstract double applySale(double price);
	
	public void buy(String item) {
		System.out.println(item + " �� �����ϴ�.");		
	}
	public void insertCart(String item) {
		System.out.println(item + "�� ��ٱ��Ͽ� ���.");
	}
}
