

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	String name;
	int id;
	public EmployeeMap(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Employee [" + (name != null ? "name=" + name + ", " : "")
				+ "id=" + id + "]";
	}
	
	public static void main(String[] args) {
		
		Map<Integer, EmployeeMap> map = new HashMap<>();
		
		map.put(101, new EmployeeMap("Rakesh", 1101));
		
		map.put(102, new EmployeeMap("Rahul", 1102));
		map.put(103, new EmployeeMap("Rohit", 1103));
		map.put(104, new EmployeeMap("Raman", 1104));
		
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
		map.remove(101);
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
		map.putIfAbsent(101, new EmployeeMap("Tarun", 1105));
		
        map.forEach((key,value)->{
                System.out.println(key + " " + value);
        });
       
		
    }
	
}
