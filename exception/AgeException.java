package exception;

class AgeCheckException extends Exception{
    String error;
    AgeCheckException(String error){
        this.error=error;
    }

    @Override
    public String toString(){
        return  "AgeCheckException [Error=" + error + "]";
    }
}

class Vote {
    int age;
    Vote(int age){
        this.age=age;
    }

    void doVote() throws AgeCheckException{
        if(age>18)
         System.out.println("You can Vote");

        else 
         throw new AgeCheckException("Your Age is less than 18");
    }
}
public class AgeException {
    public static void main(String[] args) {
        Vote v = new Vote(3);
        try {
            v.doVote();
        } catch (Exception e) {
          System.out.println(e);
        }
       
    }
    
}
