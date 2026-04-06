class StringTry
{
    public static void main(String args[])
    {
        String s="Computer Applicatoin";
        //or String s= new String("Computer Application");
        System.out.println("Length = " + s.length());//20
        System.out.println("CharAt = " + s.charAt(2));//'m'
        System.out.println("Last character = " + s.charAt(s.length()-1));//'n'
        System.out.println("IndexOf = " + s.indexOf('p'));//3
        System.out.println("LastIndexOf = " + s.lastIndexOf('p'));//11
        System.out.println("To upper Case = " + s.toUpperCase());
        System.out.println("to Lower Case = " + s.toLowerCase());
        System.out.println(s.substring(1,4));///"omp"
        System.out.println(s.substring(10));///"pplication"
        System.out.println(s.substring(s.lastIndexOf(' ')+1));//"Application"
        System.out.println(Double.toString(3.4));//to convert data type to string
        System.out.println(s.equals("COmputer Application"));///false
        System.out.println(s.equals("COmputer Application"));///false
        System.out.println(s.equalsIgnoreCase("COmputer Application"));///true
        System.out.println("Vaibhav".equals("Vaibhav"));///true
        System.out.println("Vaibhav".compareTo("Vaibhav"));///0
        System.out.println("Abhav".compareTo("Bbhav"));//-1
        System.out.println("Bbhav".compareTo("Abhav"));//1
        //s.trim - trims the space from infront and end of the inserted string.
    }
}