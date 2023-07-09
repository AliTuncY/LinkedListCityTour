
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListCityTour {
    
    public static void suppress_operations(){
        System.out.println("0 - View operations ");
        System.out.println("1 - Go to the next city ");
        System.out.println("2 - Go to the previous city ");
        System.out.println("3 - Exit ");
    }

    
    public static void tour_cities(LinkedList<String> cities){
        
        ListIterator<String> iterator = cities.listIterator();
        
        int operation;
        
        suppress_operations();
        
        Scanner scanner = new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("There is not any city");
        }
        
        boolean exit = false;
        boolean forward = true;
        
        while(!exit){
            System.out.print("Select an operation: ");
            
            operation = scanner.nextInt();
            
            switch(operation){
                case 0: 
                    suppress_operations();
                    break;
                case 1:
                    if (!forward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        forward = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Going to the city " +iterator.next());
                    }
                    else{
                        System.out.println("There are no more cities to visit.");
                        forward = true;
                    }
                    break;
                
                case 2:
                    if(forward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        forward = false;
                    }
                    
                    if(iterator.hasPrevious()){
                        System.out.println("Going to the city "+ iterator.previous());
                        
                    }
                    else{
                        System.out.println("The city tour has started..");
                        forward = true;
                    }
                    break;
                    
                case 3:  
                    exit = true;
                    System.out.println("Exiting...");
                    break;
            }
                 
        }
        
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> cities = new LinkedList<String>();
        
        cities.add("Ankara");
        cities.add("Trabzon");
        cities.add("Samsun");
        
        tour_cities(cities);
        
        
        
                
    }
}
