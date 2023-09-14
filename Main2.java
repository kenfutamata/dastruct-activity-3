import java.util.*; 

public class Main2{
static ArrayList<Integer> arr = new ArrayList<Integer>();
Scanner input = new Scanner(System.in);
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int content, size;
// inputing the size and populate the size of an array
System.out.print("Enter the size of an array: "); 
size = input.nextInt(); 

System.out.print("Enter "+size+" elements of an array: "); 
for(int i =0; i < size; i++){
arr.add(input.nextInt()); 

} 
menu(); 
}
//menu driven program

public static void menu(){
Scanner input = new Scanner(System.in);
while(true){
System.out.println(); 
System.out.println("1. get()"); 
System.out.println("2. add()"); 
System.out.println("3. remove()"); 
System.out.println("4. change()"); 
System.out.println("5. access()"); 
System.out.println("6. size()"); 
System.out.println("7. clone()"); 
System.out.println("8. contains()"); 
System.out.println("9. toString()"); 
System.out.println("10. sort()"); 
System.out.println("11. exit()\n"); 
System.out.println("Enter numbers from 1 to 11: ");
int choose = input.nextInt();
ifchoose(choose);  
}
}

//if statement for the menu driven program
public static void ifchoose(int choose){
if(choose == 1){
get(); 
}
else if(choose ==2){
add(); 
}
else if(choose == 3){
remove(); 
}
else if(choose == 4){
change();
}
else if(choose == 5){
access(); 
}
else if(choose == 6){
size(); 
}
else if(choose == 7){
clone1();
}
else if(choose == 8){
contains1(); 
}
else if(choose == 9){
tostring1();
}
else if(choose == 10){
sort();
}
else if(choose == 11){
System.exit(0); 
}

}

// 1. get(); 
public static void get(){
System.out.print("Array components: "); 
/*for(int value: arr){
System.out.print(value); 
}*/
for(int i =0; i <arr.size(); i++){
System.out.print(arr.get(i)+" ");
System.out.println(); 
}
}
//2. add(); 
public static void add(){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number you want to add: ");
arr.add(input.nextInt()); 
for(int values: arr){
System.out.print(values+" ");
}
}
//3. remove();
public static void remove(){
Scanner input = new Scanner(System.in);
System.out.print("Enter the element you want to remove: "); 
arr.remove(input.nextInt()); 

for(int values: arr){
System.out.print(values+" "); 
}
}

//4.change(); 

public static void change(){
Scanner input = new Scanner(System.in);
System.out.print("Enter the index number you want to change: "); 
int index = input.nextInt(); 

System.out.print("Enter the element you want to change: "); 
int element = input.nextInt(); 

arr.set(index, element); 

for(int values: arr){
System.out.print(values+" "); 
}
}

//5. access(); 

public static void access(){
Scanner input = new Scanner(System.in);

System.out.print("Enter an index to find its element: "); 
int acc = arr.get(input.nextInt()); 
System.out.print("Element no. found: "+acc); 
}

// 6. size(); 

public static void size(){
int size = arr.size(); 
System.out.print("The size of an array is "+size); 

}

// 7. clone(); 
public static void clone1(){
ArrayList<Integer> clonenum = (ArrayList<Integer>)arr.clone();
System.out.print("Clone array: "+clonenum);

}
//8. contains(); 
public static void contains1(){
Scanner input = new Scanner(System.in);
System.out.print("Enter  number based on the mentioned array: ");
int num = input.nextInt(); 
System.out.print("Is "+num+" present in the arraylist: "); 
System.out.print(arr.contains(num));
}

//9. toString()
public static void tostring1(){

String final1 = arr.toString(); 
System.out.print("toString() elements: "+final1);
}


//10. sort();
public static void sort(){
Collections.sort(arr); 
for(int value: arr){
System.out.print(value+" "); 
}
}
}