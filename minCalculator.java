public class minCalculator {
    // int x;  // ___ 1st number
    // int y;  // ___ 2nd number

    // public minCalculator(){
    //     System.out.println("Default Constructor Invoked");
    //     x=0;
    //     y=0;
    // }
    
    // public minCalculator(int x, int y){
    //     System.out.println("Parameterized Constructor Invoked");
    //     this.x=x;
    //     this.y=y;
    // }

    // ____ Calculator Functions
    public float add(float x, float y){            return x+y;        }
    public float subtract(float x, float y){       return x-y;        }
    public float multiply(float x, float y){       return x*y;        }
    public float divide(float x, float y){         return x/y;        }

    public void compare(float x, float y){
        if(x>y)
            System.out.println(x + " is greater than " + y);
        if(x==y)
            System.out.println(x + " is  equal to " + y);
        if(x<y)
            System.out.println(x + " is  less than " + y);
    }
    
}

