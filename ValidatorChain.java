public abstract class ValidatorChain {

    private ValidatorChain next;

    public void setNext (ValidatorChain next){
        this.next = next;
    }

    public void savePassword(Password password){
        if (checkValid(password)) {
            if (next != null){
                next.savePassword(password);
            }
        }
    }

    public abstract boolean checkValid(Password password);
}
