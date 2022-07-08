public class ContainsNumberValidatorChain extends ValidatorChain{

    @Override
    public boolean checkValid(Password password) {
        boolean valid = false;
        String pas = password.getPassword();
        char[] chars = pas.toCharArray();
        
        for (char character : chars) {
            if (Character.isDigit(character)){
                valid = true;
                break;
            }
        }
      
        if (valid){
            System.out.println("Your password " + pas);
            return true;
        } else throw new IllegalArgumentException("Password not contains numbers");
    }
}
