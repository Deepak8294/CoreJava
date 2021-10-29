public class Com{  
    public static void main(String args[]){  
        //create an ArrayList of Students    
        ArrayList myList=new ArrayList();  
        myList.add(new Student(101,"Mohit",22));  
        myList.add(new Student(106,"Deepak",23));  
        myList.add(new Student(105,"Sachin",21));  
   
        //call Collections.sort method with AgeComparator object to sort ArrayList
        Collections.sort(myList,new AgeComparator());  
        System.out.println("Sorted Student objects by Age are as follows:");
        Iterator iter= myList.iterator();  
        while(iter.hasNext()){  
            Student st=(Student) iter.next();  
            System.out.println(st.rollno+" "+st.name+" "+st.age);  
        }  
    }  
}  