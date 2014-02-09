package be.rd.beans.highschool;

import java.util.ArrayList;
import java.util.List;

import be.rd.beans.Food;
import be.rd.beans.IFoodProviderService;

public class FoodProviderServiceImpl implements IFoodProviderService{

	@Override
	public List<Food> provideLunchSet() {
		List<Food> result = new ArrayList<Food>();
		result.add(new Food("Wine"));
		result.add(new Food("Tartiflette"));
		return result;
	}

	
}
