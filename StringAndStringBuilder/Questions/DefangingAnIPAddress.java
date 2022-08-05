package StringAndStringBuilder.Questions;

class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
       address = address.replace(".", "[.]");
       return address;
    }

    public static void main(String[] args) {
      String address =   defangIPaddr( "1.1.1.1");
        System.out.println(address);
    }
}