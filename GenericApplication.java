
public class GenericApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item<String> i=new Item<String>();
		i.set("A beautiful Maltese Falcon");
		SmallBag<Item> b=new SmallBag<Item>();
		b.set(i);
		//Now get the item
		Item<String> i1=new Item<String>();
		i1=b.get();
		System.out.println(i1.get());
		
		//Or simply do this:
		
		System.out.println(b.get().get());
	}

}
