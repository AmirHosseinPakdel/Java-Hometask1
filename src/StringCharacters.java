public class StringCharacters
{
    public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";
        int spaces = 0, vowels = 0, letters = 0;
        text = text.toLowerCase();
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                spaces++;
            }
            else if (Character.isLetter(ch)) {
                letters++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            }
        }
        System.out.println("The text contained vowels: " + vowels + "\n" + "consonants: " + (letters - vowels) + "\n" + "spaces: " + spaces);
    }
}