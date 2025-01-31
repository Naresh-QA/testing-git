package Session_9;

public class equals_to {

	public static void main(String[] args) {
		String a="Qwerty";
		String b="Qwerty";
		System.out.println(a==b);//true
		System.out.println(a.equals(b));//true
		String c=new String("qwerty");
		String d=new String("qwerty");
		System.out.println(c==d);//This will consider only objects.
		System.out.println(c.equals(d));//this will consider values.
		String e="qwerty";
		String f=new String("qwerty");
		String g=new String("qwerty");
		String h=g;
		System.out.println(f==g);//false
		System.out.println(g==h);//true
		System.out.println(g.equals(h));//true
	}

}
