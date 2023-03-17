public class MyInteger {
    private int value;

    public int getValue(){
        return value;
    }
    public MyInteger(int value){
        this.value = value;
    }
    public boolean isEven(){
        if(value % 2 == 0)
            return true;
        return false;
    }
    public boolean isOdd(){
        if(value % 2 == 0)
            return false;
        return true;
    }
    public boolean isPrime(){
        boolean flag = true;
        for(int i = value-1; i>1; i--){
            if(value % i == 0)
                flag = false;
        }
        return (flag)? true:false;
    }
    public static boolean isEven(int value){
        if(value % 2 == 0)
            return true;
        return false;
    }
    public static boolean isOdd(int value){
        if(value % 2 == 0)
            return false;
        return true;
    }
    public static boolean isPrime(int value){
        boolean flag = true;
        for(int i = value-1; i>1; i--){
            if(value % i == 0)
                flag = false;
        }
        return (flag)? true:false;
    }
    public boolean equals(int value){
        if(this.value == value)
            return true;
        return false;
    }
    public boolean equals(MyInteger num){
        if(num.getValue() == value)
            return true;
        return false;
    }
}
