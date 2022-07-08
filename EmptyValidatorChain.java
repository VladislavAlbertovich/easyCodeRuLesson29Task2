public class EmptyValidatorChain extends ValidatorChain{
    @Override
    public boolean checkValid(Password password) {
        if (!password.getPassword().isEmpty()) {
            return true;
        } else {
            throw new IllegalArgumentException("empty password");
        }
    }
}
