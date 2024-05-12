package java_8_features.collection_inhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CollectionInhancement {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(35);
		list.add(40);
		list.add(50);
		
		//list.remove(0);  //remove 0th index value
		//list.remove(new Integer(10));   //remove 10 no. present in list
		//list.removeIf((i)->i<20);  //first check whether no is less than 20 or not then remove it
		//list.removeIf((i)->i%2==0);  //first check whether no is divisible by 2 or not then remove it
		
		System.out.println("-----------Printing Collection without using java 1.8-------------------------");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("List["+i+"]: "+list.get(i));
		}
		
		System.out.println("-----------Printing Collection using java 1.8-------------------------");
		 
		//Consumer implementation
		/*Consumer<Integer> c=(x)->{
		
			System.out.println(x);
		};		
		list.forEach(c);*/
		
		list.forEach((x)->System.out.println(x));
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rahul", 45000));
		empList.add(new Employee(2, "Amit", 80000));
		empList.add(new Employee(3, "Akash", 45000));
		empList.add(new Employee(4, "Lalit", 65000));
		empList.add(new Employee(5, "Amrit", 75000));
		
		//iterate empList without java 8
		for(int i=0;i<empList.size();i++) {
			System.out.println(empList.get(i).getEmpId()+" : "+empList.get(i).getEmpName()+" : "+empList.get(i).getEmpSalary());
		}
		//iterate empList using java 8
		empList.forEach((e)->System.out.println(e.getEmpId()+" : "+e.getEmpName()+" : "+e.getEmpSalary()));
		
		//forEach within forEach
		/*List<List<Integer>> list2=new ArrayList<List<Integer>>();
		list2.forEach((i)->{
			i.forEach((j)->{
				System.out.println(j);
			});
		});*/
		
		//want to delete the emp whose name start with 'a/A'
		empList.removeIf((e)->e.getEmpName().startsWith("A"));
		empList.forEach((e)->System.out.println(e));
	}
}
