public class PhoneNumberExampleTest {
    public static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for (String account : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(account);
            System.out.println("Phone number is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(account);
            System.out.println("Phone number is " + account +" is valid: "+ isvalid);
        }
    }
}
