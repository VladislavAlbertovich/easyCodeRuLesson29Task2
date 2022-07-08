public class MinLengthValidatorChain extends ValidatorChain {
    private static final int MIN = 5;

    @Override
    public boolean checkValid(Password password) {
        String pas = password.getPassword();
        int lengthPassword = pas.length();
        
        if (lengthPassword >= MIN) {
            return true;
        } else throw new IllegalArgumentException("min password length " + MIN);
    }
}
