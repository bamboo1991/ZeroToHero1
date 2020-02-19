package Exception;

public class InsuficientBlance extends RuntimeException{
    public InsuficientBlance(){
        super();
    }
public InsuficientBlance(String message){
        super(message);
}

}
