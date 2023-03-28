package testProject01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		src/main/resources/applicationContext.xml 파일에서 bean id, class 를 지정해주면서 자동으로 객체가 생성되므로(메모리가 로드되므로) 아래처럼 new 키워드를 이용해 객체를 생성할 필요가 없다.
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		
		// 1. spring container 에 먼저 접근한다
		// GenericApplicationContext ctx = new GenericApplicationContext("classpath:applicationContext.xml");
		// 2. GenericApplicationContext  밑에는 xml을 로딩하는 클래스가 있다. 해당 자식 클래스를 불러온다. import도 잊지 않고 바꿔준다.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// 3. container로 부터 bean(객체 object)를 가져온다 - dataType 이 class인 TransportationWalk를 가져온다
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		ctx.close();
		
	}
}
