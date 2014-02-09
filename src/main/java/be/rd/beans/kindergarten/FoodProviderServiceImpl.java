package be.rd.beans.kindergarten;

import java.util.ArrayList;
import java.util.List;

import be.rd.beans.Food;
import be.rd.beans.IFoodProviderService;

public class FoodProviderServiceImpl implements IFoodProviderService{

	@Override
	public List<Food> provideLunchSet() {
		List<Food> result = new ArrayList<Food>();
		result.add(new Food("Milk"));
		result.add(new Food("Biscuits"));
		return result;
	}

	
}
