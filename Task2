public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter password");
        Password password = new Password(scanner.nextLine());

        ValidatorChain chain0 = new EmptyValidatorChain();
        ValidatorChain chain1 = new MinLengthValidatorChain();
        ValidatorChain chain2 = new ContainsNumberValidatorChain();

        chain1.setNext(chain2);
        chain0.setNext(chain1);

        chain0.savePassword(password);

    }
}
