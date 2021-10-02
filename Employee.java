
public class Employee{
    
public static void main(String args[]){

    int count=0;
    int arr[]=new int[10];

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter salary"); 

    for(int i=0; i<10; i++) {

             arr[i]= sc.nextInt();
    }

    for(int j=0; j<10; j++) {

        if(arr[j]>=35000 && arr[j]<=75000){
          count++;

    }
            
    }
   
    System.out.printf("\n Number of employees who gets salary from 35000 to 75000 : "+count); 
}

}
