package be.rd.beans;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodProviderServiceTest {

	@Test
	public void testProfiles(){
		
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("main-appcontext.xml");
		
		printLunchForProfile(appCtx, "highschool");
		printLunchForProfile(appCtx, "kindergarten");
	}
	
	private void printLunchForProfile(ClassPathXmlApplicationContext appCtx, String profile){
		appCtx.getEnvironment().setActiveProfiles(profile);
		appCtx.refresh();
		IFoodProviderService provider = appCtx.getBean("foodProvider", IFoodProviderService.class);
		List<Food> result = provider.provideLunchSet();		
		for(Food f : result){
			System.out.println(f.getName());
		}
	}
}
