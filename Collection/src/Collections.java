// import java.util.*;
// import java.util.Map.Entry;

// public class Collections {

// 	public static void main(String[] args) {

// 		Stack<Integer> st = new Stack<>();
// 		st.push(1);
// 		st.push(5);
// 		st.push(10);
// 		st.push(20);
// 		st.pop();
// 		st.add(3, 45);
// 		System.out.println(st.contains(20));
// 		System.out.println(st);

// 		System.out.println("This is a Queue");
// 		Queue<Integer> qu = new PriorityQueue<>();

// 		qu.add(89);
// 		qu.add(14);
// 		qu.add(23);
// 		System.out.println(qu);
// 		System.out.println(qu.peek());
// 		int k = qu.peek();
// 		k = k + 10;
// 		System.out.println(qu.poll());
// 		System.out.println(qu);

// 		if (qu.isEmpty())
// 			System.out.println("Queue is Empty");
// 		else
// 			System.out.println("Queue is not empty");

// 		System.out.println(qu.element());

// 		// hashset enters values randomly in system
// 		// basically it follows hashcode and equals mechanism
// 		// each value has some hashcode first it will check to newly inserted
// 		// value hashcode if
// 		// both are different we simply add into set otherwise it calls equals
// 		// method
// 		// which check if both values are same then we does not insert into set
// 		Set<Integer> set = new HashSet<>();
// 		{
// 			set.add(13);
// 			set.add(9);
// 			set.add(67);
// 			set.add(56);
// 			set.add(13);

// 			// Scanner sc = new Scanner(System.in);
// 			//
// 			// for(int i=0;i<5;i++)
// 			// {
// 			// int n = sc.nextInt();
// 			// set.add(n);
// 			// }
// 			System.out.println("This is a HashSet");
// 			set.remove(13);
// 			System.out.println(set);
// 			System.out.println(set.size());
// 		}

// 		// LinkedHashset is mainly follows insertion order

// 		Set<Integer> set1 = new LinkedHashSet<>();
// 		{
// 			set1.add(13);
// 			set1.add(9);
// 			set1.add(67);
// 			set1.add(56);
// 			set1.add(13);
// 			Iterator <Integer> it = set1.iterator();
// 			while(it.hasNext())
// 			{
// 				System.out.println(it.next());
// 			}
					
// 			System.out.println("LinkedHashSet Follows Insertion order");
// 			System.out.println(set1);
// 		}

// 		// Treeset follows ascending sorted order

// 		Set<Integer> set2 = new TreeSet<>();
// 		{
// 			set2.add(13);
// 			set2.add(9);
// 			set2.add(67);
// 			set2.add(56);
// 			set2.add(13);
			
			
// 			System.out.println("TreeSet Follows ascending order");
// 			for(int it : set2)
// 			{
// 				System.out.println(it);
// 			}
// 			System.out.println(set2);

// 		}

// 		// Map is Key,Value pair
// 		// it also follows hashcode-equals mechanism

// 		Map<Integer, String> map = new HashMap<>();
// 		{
// 			map.put(0, "Avinash");
// 			map.put(2, "Atul");
// 			map.put(3, "Danny");

// 			Scanner sc = new Scanner(System.in);

// 			//
// 			// for(int i=0;i<5;i++)
// 			// {
// 			// String name = sc.nextLine();
// 			// map.put(i,name);
// 			// }
// 			System.out.println(map.entrySet());

// 			// Entryset gives us the set view of the map basically it doesnt
// 			// convert
// 			// map into set rather it provides the view

// 			for (Entry<Integer, String> entry : map.entrySet()) {
// 				System.out.println(entry.getKey() + " " + entry.getValue());
// 			}
// 			System.out.println(map.containsValue("chirag"));
// 			System.out.println(map);

// 			sc.close();
// 		}

// 		// LinkedHashmap

// 		Map<Integer, String> map1 = new LinkedHashMap<>();
// 		{

// 			Scanner sc = new Scanner(System.in);

// 			// for(int i=0;i<5;i++)
// 			// {
// 			// String name = sc.nextLine();
// 			// map1.put(i,name);
// 			// }
// 			// System.out.println(map1.containsValue("chirag"));
// 			// System.out.println(map1);

// 			sc.close();
// 		}

// 		Map<Integer, String> map2 = new TreeMap<>();
// 		{
// 			map2.put(9, "Avinash");
// 			map2.put(2, "Atul");
// 			map2.put(11, "Danny");

			
// 			Scanner sc = new Scanner(System.in);

// 			// for(int i=0;i<5;i++)
// 			// {
// 			// String name = sc.nextLine();
// 			// map2.put(i,name);
// 			// }

// 			for (Entry<Integer, String> it : map2.entrySet()) {
// 				System.out.println(it.getKey() + " " + it.getValue());
// 			}
// 			sc.close();
			

// 			// System.out.println(map2);
// 			System.out.println(map2.hashCode());
// 		}

// 	}

// }
