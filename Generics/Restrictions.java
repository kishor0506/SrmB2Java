package Generics;
public class Restrictions<K,V> {
	  private K key;
	  private V value;

	 public Restrictions(K key, V value) {
		 this.key=key;
		 this.value=value;
	 }
	 public static void main(String[] args) {
		 //Restrictions<int,char> p= new  Restrictions<>(4,'l');// Primitive Types not allowed..
		 Restrictions<Integer,Character> p= new Restrictions<>(1,'0');
		 System.out.println(p.key);
		 System.out.println(p.value);
	 }
}