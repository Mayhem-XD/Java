package mysql.Ex05_world;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CityDao cityDao = new CityDao();
		City city = cityDao.getCityById(2340);
		City city2 = cityDao.getCityByName("성남");
		System.out.println(city);
		System.out.println(city2);
		List<City> list = cityDao.getCityList("KOR", 10);
		for(City c:list)
			System.out.println(c);
		City city3 = new City("화성","KOR","Kyonggi",500000);
		cityDao.insertCity(city3);
		City city4 = cityDao.getCityByName("화성");
		System.out.println(city4);
		System.out.println("=========================================");
		city = cityDao.getCityByName("Puchon");
		city.setName("부천");
		city.setPopulation(850000);
		cityDao.update(city);
		city = cityDao.getCityByName("부천");
		System.out.println(city);
		System.out.println("=========================================");
		city = cityDao.getCityByName("화성");
		cityDao.delete(city);
		if(city==null)
			System.out.println("화성이 없음");
		else
			System.out.println(city);
		
		
	}

}
