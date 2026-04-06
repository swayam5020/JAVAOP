//Reverse s="hello" ,, o/p - olleh
class StrVowel3
{
    public static void main(String s)
    {
        int i;
        char ch;
        String rev="";//null
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);//h, e,l, l
            rev=ch+rev;//'h'+""=h, 'e'+"h"= "eh", 'l'+"eh" =leh, 'l'+"leh"=lleh
        }
        System.out.println(rev);
    }
}
