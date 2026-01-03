
public class Person {
	private String name;
	private int age;
	
	public String getpersonname(){
		return name;
	}
	public int getage() {
		return age;
	}
    public void setname(String name) {
    	if(name!=null && !name.isEmpty()) {
    	this.name= name;	
    }
    }
    	public void setage(int age) {
    		if(age>0) {
    			this.age = age;
    		}
    		
    	}
    	
    	public static void main(String[] args) {
    		Person person1= new Person();
    		person1.setname("Raman");
    		person1.setage(28);
    		System.out.println(person1.getpersonname());
    		System.out.println(person1.getage());
    		
    		
    	}
}
    