
public class Assignment_04 {

	
	public static void main(String[] args){
	
	//Declaration of variables a, b,c,d and initialization of x and y
	int a , b ,c ,d, x = 5, y = 10;

    /*This initializes a and uses order of operations, so 
     * it would multiple first and then add so the answer would be 25
     */
    a = x + y * 2;
    
    /*This initializes b and uses order of operations, so 
     * it would go from left to right which means subtract first
     * then add 2 which would equal -3
     */
    b = x - y + 2;
    
    /*This initializes c and uses order of operations, so 
     * it would add what is inside the parenthesis first and then
     * multiple by 2 making the answer 30
     */
    c = (x+y) * 2;
    
    /*This initializes d and uses the modulus operator. which would divide y by x 
     * and only return the remainder which would be 0
     */
    d = y % x;
    
    System.out.println("a = " + a  + " b = " + b + " c =  " + c + " d = " + d);
	
}
	
}
