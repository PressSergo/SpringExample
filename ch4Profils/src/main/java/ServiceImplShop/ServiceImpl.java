package ServiceImplShop;

import Food.Food;
import Service.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLaunchSet() {
        List<Food> list = new ArrayList<>();
        list.add(new Food("hamburger"));
        list.add(new Food("hamburger3223"));
        list.add(new Food("sholll 3"));
        return list;
    }
}
