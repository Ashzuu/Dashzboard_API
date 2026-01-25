package ashz.musculashzboard.api.services.exceptions;

public class EntityNotFoundException extends Exception {
    public EntityNotFoundException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
