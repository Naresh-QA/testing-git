package Session_11;

import java.awt.SecondaryLoop;

import io.opentelemetry.semconv.SemanticAttributes.FaasTriggerValues;

public class main_methods {

	public static void main(String[] args) {
		methods naresh=new methods();
		naresh.m1();
		String valueString=naresh.m2();
		System.out.println(valueString);
		
		naresh.m3(23);
		int r1=naresh.m4(23);
		System.out.println(r1);
	}

}
