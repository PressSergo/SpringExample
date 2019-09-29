package ServiceImplHouse;

import Food.Food;
import Service.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLaunchSet() {
        List<Food> list = new ArrayList<>();
        list.add(new Food("Coki"));
        list.add(new Food("Coki344444"));
        list.add(new Food("Coki nono 3"));
        return list;
    }
}

