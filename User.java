

public class User {
    private final int number;

    public User(int number){
        this.number = number;
    }

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public long getFact(){
        return calculateFactorial(number);
    }
}
